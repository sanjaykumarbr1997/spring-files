package com.xworkz.camera_flash.beans;

import java.io.Serializable;

public class FlashBean implements Serializable{
	private int id;
	private String type;
	@Override
	public String toString() {
		return "FlashBean [id=" + id + ", type=" + type + "]";
	}
	public FlashBean(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	

}
