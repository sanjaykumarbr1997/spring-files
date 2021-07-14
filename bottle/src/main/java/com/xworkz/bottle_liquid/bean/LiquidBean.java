package com.xworkz.bottle_liquid.bean;

import java.io.Serializable;

public class LiquidBean implements Serializable {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "LiquidBean [id=" + id + ", name=" + name + "]";
	}
	
	public LiquidBean() {
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

	
}
