package com.xworkz.speaker_magnet.beans;

public class MagnetBean {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "MagnetBean [id=" + id + ", name=" + name + "]";
	}
	public MagnetBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
