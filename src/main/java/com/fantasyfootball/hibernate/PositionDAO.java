package com.fantasyfootball.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.fantasyfootball.ultimate.model.Position;

public class PositionDAO {
	
	public static void save(List<Position> list) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
	    Session session = sf.openSession();
	    Transaction tx = session.beginTransaction();
	    
	    for(Position position: list) {
	    	session.save(position);
	    }
	    
	    tx.commit();
	    session.close();
	}

}
