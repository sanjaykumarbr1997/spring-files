 package com.xworkz.hair_drier.drier.bean;

import java.io.Serializable;

public class DrierBean implements Serializable {
	
	private int id;
	private String name;
	private String color;
	private int power;
	
	public DrierBean() {
		System.out.println(this.getClass().getSimpleName()+ " creeated");
	}

	@Override
	public String toString() {
		return "DrierBean [id=" + id + ", name=" + name + ", color=" + color + ", power=" + power + "]";
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}
	

}
