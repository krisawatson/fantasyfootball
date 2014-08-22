package com.fantasyfootball.ultimate.comparators;

import java.util.Comparator;

import com.fantasyfootball.ultimate.model.Player;

public class PlayerTotalPoints implements Comparator<Player> {
	
	public int compare(Player player1, Player player2) {
        if (player1.getTotalPoints() == player2.getTotalPoints()){
        	return 0;
        }
        return player1.getTotalPoints() < player2.getTotalPoints() ? 1 : -1;
    }

}
