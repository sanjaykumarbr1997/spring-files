package com.xworkz.country_states.bean;

import java.io.Serializable;

public class CountryBean implements Serializable {
	
	private int id;
	private String name;
	private String capital;
	private StatesBean state;
	@Override
	public String toString() {
		return "CountryBean [id=" + id + ", name=" + name + ", capital=" + capital + ", state=" + state + "]";
	}
	
	public CountryBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
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

	public StatesBean getState() {
		return state;
	}

	public void setState(StatesBean state) {
		this.state = state;
	}
	
	

}