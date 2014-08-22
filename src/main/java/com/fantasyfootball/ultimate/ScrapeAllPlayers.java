package com.fantasyfootball.ultimate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.json.JSONArray;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fantasyfootball.hibernate.FFSPlayerDAO;
import com.fantasyfootball.hibernate.PlayerDAO;
import com.fantasyfootball.scout.ScrapeData;
import com.fantasyfootball.scout.model.FFSPlayer;
import com.fantasyfootball.ultimate.constants.FFS;
import com.fantasyfootball.ultimate.model.Player;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;

/**
 * Hello world!
 *
 */
public class ScrapeAllPlayers 
{
	public static void main( String[] args )
    {
    	try {
			// Login to both fantasy premierleague site and fantasy football scout website
    		doLogin();
			
			List<Player> playerList = getPlayerList();
			PlayerDAO.save(playerList);
			
			ScrapeData ffsData = new ScrapeData();
			List<FFSPlayer> ffsProjections = ffsData.getPlayerSats("/projections/season-projections/");
			FFSPlayerDAO.save(ffsProjections);
			
			List<FFSPlayer> players = FFSPlayerDAO.list();
			
			
			System.out.println(players.size());
			
			
//			if(playerList != null){
//		    	// Sorts players by total points
//		    	Collections.sort(playerList, new PlayerTotalPoints());
//		    	// Sorts players by red cards
////		    	Collections.sort(playerList, new PlayerRedCards());
//		    	
//
//	    		System.out.println("First Name, Second Name, Assists, Goals, CBI, Recoveries, Key Passes, Total Points");
//		    	for(int i=0; i<50; i++){
//		    		Player player = playerList.get(i);
//		    		System.out.println(player.getFirstName()
//		    				+ "," + player.getSecondName()
//		    				+ "," + player.getAssists()
//		    				+ "," + player.getGoalsScored()
//		    				+ "," + player.getClearancesBlocksInterceptions()
//		    				+ "," + player.getRecoveries()
//		    				+ "," + player.getKeyPasses()
//		    				+ "," + player.getTotalPoints());
//		    	}
//			} else {
//				System.out.println("Something went wrong while getting the list of players");
//			}
    	} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
    }
    
    
    private static void doLogin() throws IOException {
    	// Login to fantasy premierleague
		Jsoup.connect("https://users.premierleague.com/PremierUser/redirectLogin")
			    .data("email", "kris.watson@anaeko.com", "password", "TacoChip").post();
	}
	
	private static List<Player> getPlayerList(){
		try {
			Document doc = Jsoup.connect("http://ultimate.premierleague.com/a/squad/transfers")
					.get();
			Elements scriptElements = doc.select("script");
			
			Element lastScriptTag = scriptElements.last();
			String scriptContent = lastScriptTag.data();
            
			String[] lines = scriptContent.split("\\r?\\n");
			// Find the json object "elements"
			Pattern pattern = Pattern.compile("(\\{\"elements\").*\\}]");

			for(int i=0; i<lines.length; i++){
				Matcher matcher = pattern.matcher(lines[i]);
	
	            while (matcher.find()) {
	            	String jsonString = matcher.group();
	            	JSONObject jsonObj = new JSONObject(jsonString + "}");  // Appending the closing bracket after regex matching only part of the string
	            	JSONArray players = jsonObj.getJSONArray("elements");
	            	List<Player> playerList = new ArrayList<Player>();
	            	for(int j=0; j<players.length(); j++){
	            		Gson gson = new Gson();
	            		Player player = gson.fromJson(players.get(j).toString(), Player.class);
	            		playerList.add(player);
	            	}
	            	return playerList;
	            }
			}
		} catch (IOException e) {
			System.err.println("Error while trying to open transfers page");
			System.err.println(e.getLocalizedMessage());
		} catch (JsonSyntaxException e) {
			System.err.println("Error while parsing a player");
			System.err.println(e.getLocalizedMessage());
		}
		return null;
	}
}
