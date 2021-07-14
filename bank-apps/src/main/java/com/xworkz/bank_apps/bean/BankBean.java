package com.xworkz.bank_apps.bean;

import java.io.Serializable;

public class BankBean implements Serializable{
	
	private int id;
	private String name;
	private String headQuarters;
	private int noOfBranches;
	private AppsBean app;
	
	public BankBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
		
	}

	

	@Override
	public String toString() {
		return "BankBean [id=" + id + ", name=" + name + ", headQuarters=" + headQuarters + ", noOfBranches="
				+ noOfBranches + ", app=" + app + "]";
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

	public String getHeadQuarters() {
		return headQuarters;
	}

	public void setHeadQuarters(String headQuarters) {
		this.headQuarters = headQuarters;
	}

	public int getNoOfBranches() {
		return noOfBranches;
	}

	public void setNoOfBranches(int noOfBranches) {
		this.noOfBranches = noOfBranches;
	}



	public AppsBean getApp() {
		return app;
	}



	public void setApp(AppsBean app) {
		this.app = app;
	}
	

}
