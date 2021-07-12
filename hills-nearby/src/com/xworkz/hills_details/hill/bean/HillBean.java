package com.xworkz.hills_details.hill.bean;

import java.io.Serializable;

public class HillBean implements Serializable {
	
	private int id;
	private String name;
	private String location;
	private boolean isTrainAvailable;
	private String diffucultyLevel;
	public HillBean(int id, String name, String location, boolean isTrainAvailable, String diffucultyLevel) {
		this.id = id;
		this.name = name;
		this.location = location;
		this.isTrainAvailable = isTrainAvailable;
		this.diffucultyLevel = diffucultyLevel;
	}
	@Override
	public String toString() {
		return "HillBean [id=" + id + ", name=" + name + ", location=" + location + ", isTrainAvailable="
				+ isTrainAvailable + ", diffucultyLevel=" + diffucultyLevel + "]";
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
	public boolean isTrainAvailable() {
		return isTrainAvailable;
	}
	public void setTrainAvailable(boolean isTrainAvailable) {
		this.isTrainAvailable = isTrainAvailable;
	}
	public String getDiffucultyLevel() {
		return diffucultyLevel;
	}
	public void setDiffucultyLevel(String diffucultyLevel) {
		this.diffucultyLevel = diffucultyLevel;
	}
	
	

}
