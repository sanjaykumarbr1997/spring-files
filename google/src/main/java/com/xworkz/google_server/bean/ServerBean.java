package com.xworkz.google_server.bean;

import java.io.Serializable;

public class ServerBean implements Serializable{
	private int id;
	private String name;
	@Override
	public String toString() {
		return "ServerBean [id=" + id + ", name=" + name + "]";
	}
	
	public ServerBean() {
		System.out.println(this.getClass().getSimpleName() +"created");
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
