package com.fantasyfootball.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fantasyfootball.ultimate.model.Player;

public class PlayerDAO {
	
	@SuppressWarnings("unchecked")
	public static List<Player> list() {
	    SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	 
	    List<Player> players = session.createQuery("from Player").list();
	    session.close();
	    return players;
	}
	
	public static void save(List<Player> list) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    for(Player player: list) {
	    	System.out.println("Saving " + player.getSecondName());
	    	session.save(player);
	    }
	    
	    tx.commit();
	    session.close();
	}

}
