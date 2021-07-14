package com.xworkz.camera_flash.beans;

import java.io.Serializable;

public class CameraBean implements Serializable {
	private int id;
	private String name;
	private String company;
	private FlashBean flash;
	@Override
	public String toString() {
		return "CameraBean [id=" + id + ", name=" + name + ", company=" + company + ", flash=" + flash + "]";
	}
	public CameraBean(int id, String name, String company, FlashBean flash) {
		super();
		this.id = id;
		this.name = name;
		this.company = company;
		this.flash = flash;
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
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public FlashBean getFlash() {
		return flash;
	}
	public void setFlash(FlashBean flash) {
		this.flash = flash;
	}
	
	

}
