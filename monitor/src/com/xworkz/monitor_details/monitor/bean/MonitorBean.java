package com.xworkz.monitor_details.monitor.bean;

import java.io.Serializable;

public class MonitorBean implements Serializable{
	
	private int id;
	private String name;
	private int refreshingRate;
	private String type;
	private float price;
	public MonitorBean(int id, String name, int refreshingRate, String type, float price) {
		this.id = id;
		this.name = name;
		this.refreshingRate = refreshingRate;
		this.type = type;
		this.price = price;
	}
	@Override
	public String toString() {
		return "MonitorBean [id=" + id + ", name=" + name + ", refreshingRate=" + refreshingRate + ", type=" + type
				+ ", price=" + price + "]";
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
	public int getRefreshingRate() {
		return refreshingRate;
	}
	public void setRefreshingRate(int refreshingRate) {
		this.refreshingRate = refreshingRate;
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
