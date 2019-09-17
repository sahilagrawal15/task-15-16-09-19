package com.Hib;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpLaptop {

	public static void main(String[] args) {

		Session session=Conn.getSF().openSession();
		
		Emp emp=new Emp(111,"Amit","Pune",30000,new Laptop(501));
		
		Transaction tr=session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
	}

}
