package com.Hib;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class Conn {
	public static SessionFactory getSF()
	{
		Configuration config=new Configuration().configure().addAnnotatedClass(Emp.class).addAnnotatedClass(Laptop.class).addAnnotatedClass(Vehicle.class);
		
		ServiceRegistry reg=new ServiceRegistryBuilder().applySettings(config.getProperties()).buildServiceRegistry();
		SessionFactory sf=config.buildSessionFactory(reg);
		return sf;
	}

}
