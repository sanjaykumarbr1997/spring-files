package com.xworkz.clock_details.clock.bean;

import java.io.Serializable;

public class ClockBean implements Serializable {
	
	private int id;
	private String name;
	private String shape;
	private String type;
	private float price;
	
	public ClockBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
		
	}

	@Override
	public String toString() {
		return "ClockBean [id=" + id + ", name=" + name + ", shape=" + shape + ", type=" + type + ", price=" + price
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

	public String getShape() {
		return shape;
	}

	public void setShape(String shape) {
		this.shape = shape;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	

}
