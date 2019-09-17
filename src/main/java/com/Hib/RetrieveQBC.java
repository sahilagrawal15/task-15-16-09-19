package com.Hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class RetrieveQBC {

	public static void main(String[] args) {
		
		Session session=Conn.getSF().openSession();
		Criteria criteria=session.createCriteria(Emp.class);
		
		//Filtering of data in QBC
		Criterion criterion1=Restrictions.gt("salary", 20000);
		Criterion criterion2=Restrictions.between("eid", 102, 104);
		//Criterion criterion3=Restrictions.in("name", "manish","rajat");
		
		criteria.add(criterion1);
		criteria.add(criterion2);
		//criteria.add(criterion3);
		
		
		//Ordering of data 
		Order order=Order.desc("salary"); //Printing in descending order of salaries
		criteria.addOrder(order);
		
		//Getting data in listEmp 
		List<Emp> listEmp=criteria.list();
		
		//Printing data of emp table
		for(Emp e:listEmp3)
		{
			System.out.println("Table data is :");
			System.out.println(e);
		}
		
	}

}
