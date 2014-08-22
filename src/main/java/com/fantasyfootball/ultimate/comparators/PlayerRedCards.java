package com.fantasyfootball.ultimate.comparators;

import java.util.Comparator;

import com.fantasyfootball.ultimate.model.Player;

public class PlayerRedCards implements Comparator<Player> {
	
	public int compare(Player player1, Player player2) {
        if (player1.getRedCards() == player2.getRedCards()){
        	return 0;
        }
        return player1.getRedCards() < player2.getRedCards() ? 1 : -1;
    }

}
