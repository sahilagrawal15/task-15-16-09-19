package com.Hib;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class EmpVehicle {

	public static void main(String[] args) {
		
		Session session=Conn.getSF().openSession();
		
		Emp emp=new Emp(110,"Amit","Pune",30000,new Vehicle(002));
		
		Transaction tr=session.beginTransaction();
		session.save(emp);
		tr.commit();
		session.close();
	}

}
