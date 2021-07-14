package com.xworkz.himalaya_mountain.beans;

import java.io.Serializable;

public class MountainBean implements Serializable {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "MountainBean [id=" + id + ", name=" + name + "]";
	}
	public MountainBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	

}
