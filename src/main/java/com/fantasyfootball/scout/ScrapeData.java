package com.fantasyfootball.scout;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jsoup.Connection;
import org.jsoup.Connection.Response;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import com.fantasyfootball.scout.model.FFSPlayer;

public class ScrapeData {
	
	private static Map<String, String> cookies;
	
	public ScrapeData(){
		doLogin();
	}
	
	private void doLogin(){
		try {
			Response loginForm = Jsoup.connect("http://members.fantasyfootballscout.co.uk/")
			         .method(Connection.Method.POST)
			         .data("cookieexists", "false")
			         .data("username", "andyRokit")
			         .data("password", "TacoChip")
			         .data("login", "Login")
			         .timeout(0)
			         .execute();
			
			cookies = loginForm.cookies();
		} catch (IOException e) {
			System.err.println(e.getLocalizedMessage());
		}
	}
	
	public List<FFSPlayer> getPlayerSats(String postfix) throws IOException{
		Document doc = Jsoup.connect("http://members.fantasyfootballscout.co.uk" + postfix)
	             .cookies(cookies)
	             .timeout(0)
	             .get();
		
		List<FFSPlayer> players = new ArrayList<FFSPlayer>();
		
		Elements dataTable = doc.select("table.stats tbody");
		
		for(Element row:dataTable.select("tr")){
			FFSPlayer player = new FFSPlayer();
			Elements tds = row.select("td");
			player.setName(tds.get(0).ownText());
			player.setTeam(tds.get(1).ownText());
			player.setPosition(tds.get(2).ownText());
			player.setPrice(Double.parseDouble(tds.get(3).ownText()));
			player.setMins(Integer.parseInt(tds.get(4).ownText()));
			player.setGoals(Double.parseDouble(tds.get(5).ownText()));
			player.setAssists(Double.parseDouble(tds.get(6).ownText()));
			player.setCleanSheets(Double.parseDouble(tds.get(7).ownText()));
			player.setBonus(Double.parseDouble(tds.get(8).ownText()));
			player.setYellowCards(Double.parseDouble(tds.get(9).ownText()));
			player.setFplPoints(Double.parseDouble(tds.get(10).ownText()));
			player.setValue(Double.parseDouble(tds.get(11).ownText()));
			
			players.add(player);
		}
		
		return players;
	}
}
