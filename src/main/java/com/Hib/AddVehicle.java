package com.Hib;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AddVehicle {

	public static void main(String[] args) {
		
		Session session=Conn.getSF().openSession();
	
		Vehicle vehicle1=new Vehicle(001,"Hero","2019",30000);
		Vehicle vehicle2=new Vehicle(002,"TVS","2018",40000);
		Vehicle vehicle3=new Vehicle(003,"Yamaha","2017",20000);
		Vehicle vehicle4=new Vehicle(004,"Honda","2019",60000);
		
		Transaction tr=session.beginTransaction();
		session.save(vehicle1);
		session.save(vehicle2);
		session.save(vehicle3);
		session.save(vehicle4);
		
		tr.commit();
		session.close();
		System.out.println("Data Inserted Successfully");

	}

}
