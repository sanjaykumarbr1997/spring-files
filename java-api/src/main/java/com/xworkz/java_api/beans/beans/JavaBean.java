package com.xworkz.java_api.beans.beans;

import java.io.Serializable;

public class JavaBean implements Serializable{
	
	private int id;
	private String company;
	private String location;
	private APIBean api;
	@Override
	public String toString() {
		return "JavaBean [id=" + id + ", company=" + company + ", location=" + location + ", api=" + api + "]";
	}
	public JavaBean(int id, String company, String location, APIBean api) {
		super();
		this.id = id;
		this.company = company;
		this.location = location;
		this.api = api;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public APIBean getApi() {
		return api;
	}
	public void setApi(APIBean api) {
		this.api = api;
	}
	
	
	

}
