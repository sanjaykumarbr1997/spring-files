package com.xworkz.human_heart.bean;

import java.io.Serializable;

public class HeartBean implements Serializable {
	
	private int id;
	private int size;
	@Override
	public String toString() {
		return "HeartBean [id=" + id + ", size=" + size + "]";
	}
	public HeartBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}

	
}
