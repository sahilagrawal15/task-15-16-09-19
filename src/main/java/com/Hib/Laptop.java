package com.Hib;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Laptop {

	@Id
	private int id;
	private String brand;
	
	private int price;
	@OneToOne(mappedBy = "laptop")
	private Emp emp;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", brand=" + brand + ", price=" + price + "]";
	}
	public Laptop(int id, String brand, int price) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
	}
	public Laptop() {
		super();
	}
	public Emp getEmp() {
		return emp;
	}
	public void setEmp(Emp emp) {
		this.emp = emp;
	}
	public Laptop(int id, String brand, int price, Emp emp) {
		super();
		this.id = id;
		this.brand = brand;
		this.price = price;
		this.emp = emp;
	}
	public Laptop(int id) {
		super();
		this.id = id;
	}
	
	
}
