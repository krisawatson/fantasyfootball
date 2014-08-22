package com.fantasyfootball.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fantasyfootball.scout.model.FFSPlayer;

public class FFSPlayerDAO {
	
	@SuppressWarnings("unchecked")
	public static List<FFSPlayer> list() {
	    SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	 
	    List<FFSPlayer> players = session.createQuery("from FFSPlayer").list();
	    session.close();
	    return players;
	}
	
	public static void save(List<FFSPlayer> list) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    for(FFSPlayer player: list) {
	    	System.out.println("Saving " + player.getName());
	    	session.save(player);
	    }
	    
	    tx.commit();
	    session.close();
	}

}
