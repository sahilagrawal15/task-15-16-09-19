package com.Hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class Crud {

	public static void main(String[] args) {
		
		Session session=Conn.getSF().openSession();
		String HQL="select eid,ename,city from Emp where salary>20000";
		Query query=session.createQuery(HQL);
		Transaction tr=session.beginTransaction();
		List<Emp> emp=query.list();
		
		
	}

}
