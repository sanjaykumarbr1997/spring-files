package com.xworkz.google_server.bean;

import java.io.Serializable;

public class GoogleBean implements Serializable {
	private int id;
	private String location;
	private int noOfEmployees;
	private ServerBean server;
	@Override
	public String toString() {
		return "GoogleBean [id=" + id + ", location=" + location + ", noOfEmployees=" + noOfEmployees + ", server="
				+ server + "]";
	}
	
	public GoogleBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getNoOfEmployees() {
		return noOfEmployees;
	}

	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}

	public ServerBean getServer() {
		return server;
	}

	public void setServer(ServerBean server) {
		this.server = server;
	}
	
	

}
