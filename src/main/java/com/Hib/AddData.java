package com.Hib;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddData {

	public static void main(String[] args) {
		
		Session session=Conn.getSF().openSession();

		Emp emp1=new Emp(101,"Manish","Pune",30000);
		Emp emp2=new Emp(102,"Ankit","Bhopal",50000);
		Emp emp3=new Emp(103,"Bhavik","Mumbai",20000);
		Emp emp4=new Emp(104,"Rajat","Indore",70000);
		
		
		
		

		Transaction tr=session.beginTransaction();
		session.save(emp1);
		session.save(emp2);
		session.save(emp3);
		session.save(emp4);
		
		tr.commit();
		session.close();
		System.out.println("Data Inserted Successfully");
	}

}
