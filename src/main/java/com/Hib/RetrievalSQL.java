package com.Hib;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class RetrievalSQL {

	public static void main(String[] args) {
		
		Session session=Conn.getSF().openSession();
		String SQL="select * from Emp";
		Query query=session.createQuery(SQL);
		Transaction tr=session.beginTransaction();
		List<Emp> rows = query.list();
		for(Object[] row : rows){
			Emp emp = new Emp();
			emp.setEid(Integer.parseInt(row[0].toString()));
			System.out.println(emp);
		}
		
	}

}
