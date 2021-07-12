package com.xworkz.battery_details.battery.bean;

import java.io.Serializable;

public class BatteryBean implements Serializable {
	
	private int id;
	private String name;
	private int power;
	private int price;
	
	public BatteryBean() {
		System.out.println(this.getClass().getSimpleName());
	}
	

	@Override
	public String toString() {
		return "BatteryBean [id=" + id + ", name=" + name + ", power=" + power + ", price=" + price + "]";
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

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	
}
