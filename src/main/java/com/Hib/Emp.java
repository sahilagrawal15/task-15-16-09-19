package com.Hib;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Emp {
	
	@Id
	private int eid;
	private String ename;
	private String city;
	private int salary;
	@OneToOne(fetch = FetchType.LAZY)
	private Vehicle vehicle;
	@OneToOne
	private Laptop laptop;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Emp(int eid, String ename, String city, int salary) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.salary = salary;
	}
	public Emp() {
		super();
	}
	public Emp(int eid) {
		super();
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", city=" + city + ", salary=" + salary + ", vehicle=" + vehicle
				+ "]";
	}
	public Emp(int eid, String ename, String city, int salary, Vehicle vehicle) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.salary = salary;
		this.vehicle = vehicle;
	}
	public Emp(int eid, String ename, String city, int salary, Laptop laptop) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.city = city;
		this.salary = salary;
		this.laptop = laptop;
	}
	public Laptop getLaptop() {
		return laptop;
	}
	public void setLaptop(Laptop laptop) {
		this.laptop = laptop;
	}
	
	

}
