package com.fantasyfootball.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fantasyfootball.ultimate.model.Team;

public class TeamDAO {
	
	public static void save(List<Team> list) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    for(Team team: list) {
	    	session.save(team);
	    }
	    
	    tx.commit();
	    session.close();
	}

}
