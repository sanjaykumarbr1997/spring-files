package com.xworkz.market.bean;

import java.io.Serializable;

public class MarketBean implements Serializable {
	
	private int id;
	private String name;
	private String location;
	private int noOfBranches;
	
	public MarketBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}

	@Override
	public String toString() {
		return "MarketBean [id=" + id + ", name=" + name + ", location=" + location + ", noOfBranches=" + noOfBranches
				+ "]";
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}
	
	
	
	

}
