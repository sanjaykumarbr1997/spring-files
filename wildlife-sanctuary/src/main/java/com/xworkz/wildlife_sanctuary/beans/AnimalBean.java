package com.xworkz.wildlife_sanctuary.beans;

import java.io.Serializable;

public class AnimalBean implements Serializable{
	
	private int id;
	private String name;
	private int noOfAnimals;
	@Override
	public String toString() {
		return "AnimalBean [id=" + id + ", name=" + name + ", noOfAnimals=" + noOfAnimals + "]";
	}
	
	public AnimalBean(int id, String name, int noOfAnimals) {
		super();
		this.id = id;
		this.name = name;
		this.noOfAnimals = noOfAnimals;
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
	public int getNoOfAnimals() {
		return noOfAnimals;
	}
	public void setNoOfAnimals(int noOfAnimals) {
		this.noOfAnimals = noOfAnimals;
	}
	

}
