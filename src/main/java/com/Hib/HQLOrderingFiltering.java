package com.Hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;

public class HQLOrderingFiltering {

	public static void main(String[] args) {
		
		Session session=Conn.getSF().openSession();
	
		
		//Ordering and filtering query
		String HQL="from Emp where salary<50000 order by salary desc";
		List<Emp> list=session.createQuery(HQL).list();
		
		for(int i=0;i<list.size();i++)
		{
			Emp emp=list.get(i);
			System.out.println("Data for employee "+i);
			System.out.println(emp.getEid());
			System.out.println(emp.getEname());
			System.out.println(emp.getCity());
			System.out.println(emp.getSalary());
			System.out.println();
		}
		
	}

}
