package com.Hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DML {

	public static void main(String[] args) {
		
		Session session = Conn.getSF().openSession();
		
		//Updating through HQL
		String HQL="update Emp e set e.salary=10000 where e.eid=101";
		Transaction tr=session.beginTransaction();
		Query query = session.createQuery(HQL);
        int count = query.executeUpdate();
        tr.commit();
        session.close();
        System.out.println(count);
	}

}
