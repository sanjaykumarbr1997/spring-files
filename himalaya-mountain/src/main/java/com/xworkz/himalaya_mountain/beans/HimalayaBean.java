package com.xworkz.himalaya_mountain.beans;

import java.io.Serializable;

public class HimalayaBean implements Serializable{
	private String id;
	private String location;
	private String weatherType;
	private MountainBean mountain;
	@Override
	public String toString() {
		return "HimalayaBean [id=" + id + ", location=" + location + ", weatherType=" + weatherType + ", mountain="
				+ mountain + "]";
	}
	public HimalayaBean(String id, String location, String weatherType, MountainBean mountain) {
		super();
		this.id = id;
		this.location = location;
		this.weatherType = weatherType;
		this.mountain = mountain;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getWeatherType() {
		return weatherType;
	}
	public void setWeatherType(String weatherType) {
		this.weatherType = weatherType;
	}
	public MountainBean getMountain() {
		return mountain;
	}
	public void setMountain(MountainBean mountain) {
		this.mountain = mountain;
	}
	

}
