package com.xworkz.country_states.bean;

import java.io.Serializable;

public class StatesBean implements Serializable {
	private int id;
	private String name;
	private String capital;
	@Override
	public String toString() {
		return "StatesBean [id=" + id + ", name=" + name + ", capital=" + capital + "]";
	}
	
	public StatesBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
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

	public String getCapital() {
		return capital;
	}

	public void setCapital(String capital) {
		this.capital = capital;
	}

	
}
