package com.Hib;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;

public class ProjectionQBC {

	public static void main(String[] args) {

		Session session = Conn.getSF().openSession();
		Criteria criteria = session.createCriteria(Emp.class);
		
		//Making Projections
		ProjectionList projectionList=Projections.projectionList();
		
		Projection p1=Projections.property("eid");
		Projection p2=Projections.property("ename");
		
		projectionList.add(p1);
		projectionList.add(p2);
		
		criteria.setProjection(projectionList);
		
		//Creating an object array for storing
		List<Object[]> objArray = criteria.list();
		
		objArray.forEach((o) -> {
            System.out.println("ID: " + o[0] +", Name: " + o[1]);
        });
		
		
		


	}

}
