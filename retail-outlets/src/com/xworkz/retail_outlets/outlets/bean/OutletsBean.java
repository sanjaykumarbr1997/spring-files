package com.xworkz.retail_outlets.outlets.bean;

import java.io.Serializable;

public class OutletsBean implements Serializable{
	
	private int id;
	private String name;
	private String location;
	private boolean isDiscountAvailable;
	private boolean isParkingAvailable;
	@Override
	public String toString() {
		return "OutletsBean [id=" + id + ", name=" + name + ", location=" + location + ", isDiscountAvailable="
				+ isDiscountAvailable + ", isParkingAvailable=" + isParkingAvailable + "]";
	}
	public OutletsBean(int id, String name, String location, boolean isDiscountAvailable, boolean isParkingAvailable) {
	
		this.id = id;
		this.name = name;
		this.location = location;
		this.isDiscountAvailable = isDiscountAvailable;
		this.isParkingAvailable = isParkingAvailable;
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
	public boolean isDiscountAvailable() {
		return isDiscountAvailable;
	}
	public void setDiscountAvailable(boolean isDiscountAvailable) {
		this.isDiscountAvailable = isDiscountAvailable;
	}
	public boolean isParkingAvailable() {
		return isParkingAvailable;
	}
	public void setParkingAvailable(boolean isParkingAvailable) {
		this.isParkingAvailable = isParkingAvailable;
	}
	
	

}
