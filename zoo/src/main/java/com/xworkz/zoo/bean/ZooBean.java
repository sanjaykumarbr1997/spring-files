package com.xworkz.zoo.bean;

import java.io.Serializable;

public class ZooBean implements Serializable {
	
	private int id;
	private String name;
	private String address;
	private int noOfAnimals;
	private String[] an;
	@Override
	public String toString() {
		return "ZooBean [id=" + id + ", name=" + name + ", address=" + address + ", noOfAnimals=" + noOfAnimals + "]";
	}
	
	public ZooBean() {
		System.out.println(this.getClass().getSimpleName() +" created");
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNoOfAnimals() {
		return noOfAnimals;
	}

	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}
	

}
