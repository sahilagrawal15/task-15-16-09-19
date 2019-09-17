package com.Hib;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddLaptop {

	public static void main(String[] args) {

		Session session=Conn.getSF().openSession();
		
		Laptop laptop1=new Laptop(501,"Lenovo",50000);
		Laptop laptop2=new Laptop(502,"Dell",60000);
		
		Transaction tr=session.beginTransaction();
		session.save(laptop1);
		session.save(laptop2);
		
		tr.commit();
		session.close();
		System.out.println("Data Inserted Successfully");
	}

}
