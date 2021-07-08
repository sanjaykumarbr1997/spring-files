package com.xworkz.operating_systems.bean;

import java.io.Serializable;

public class OSBean implements Serializable {
	
	private int id;
	private String name;
	private int initialReleaseYear;
	private String isOpenSource;
	
	public OSBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
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
	public int getInitialReleaseYear() {
		return initialReleaseYear;
	}
	public void setInitialReleaseYear(int initialReleaseYear) {
		this.initialReleaseYear = initialReleaseYear;
	}
	
	
	public String getIsOpenSource() {
		return isOpenSource;
	}
	public void setIsOpenSource(String isOpenSource) {
		this.isOpenSource = isOpenSource;
	}
	public void displayAllOS() {
		System.out.println("id: "+getId()+" name:"+getName()+" initialReleaseYear:"+getInitialReleaseYear()+" isOpenSource:"+getIsOpenSource());
	}

}
