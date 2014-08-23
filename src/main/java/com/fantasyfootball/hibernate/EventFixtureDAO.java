package com.fantasyfootball.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fantasyfootball.ultimate.model.EventFixture;

public class EventFixtureDAO {
	
	public static void save(List<EventFixture> list) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    for(EventFixture item: list) {
	    	session.save(item);
	    }
	    
	    tx.commit();
	    session.close();
	}

}
