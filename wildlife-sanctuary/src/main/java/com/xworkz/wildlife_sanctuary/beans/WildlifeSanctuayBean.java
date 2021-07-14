package com.xworkz.wildlife_sanctuary.beans;

import java.io.Serializable;

public class WildlifeSanctuayBean implements Serializable {
	private int id;
	private String name;
	private String location;
	private AnimalBean animal;
	
	@Override
	public String toString() {
		return "WildlifeSanctuayBean [id=" + id + ", name=" + name + ", location=" + location + ", animal=" + animal
				+ "]";
	}
	
	public WildlifeSanctuayBean(int id, String name, String location, AnimalBean animal) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.animal = animal;
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
	public AnimalBean getAnimal() {
		return animal;
	}
	public void setAnimal(AnimalBean animal) {
		this.animal = animal;
	}
	
	

}
