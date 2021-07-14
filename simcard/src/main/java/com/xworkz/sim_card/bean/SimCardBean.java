package com.xworkz.sim_card.bean;

import java.io.Serializable;

public class SimCardBean implements Serializable {
	
	private int id;
	private String name;
	private String headQuarters;
	private int revenue;
	
	public SimCardBean() {
		System.out.println(this.getClass().getSimpleName());
	}
	

	public SimCardBean(int id) {
		this.id = id;
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

	public int getRevenue() {
		return revenue;
	}

	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	
	

}
