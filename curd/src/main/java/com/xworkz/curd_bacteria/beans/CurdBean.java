package com.xworkz.curd_bacteria.beans;

import java.io.Serializable;

public class CurdBean implements Serializable {
	
	private int id;
	private String name;
	private String expiryMonth;
	private BacteriaBean bacteria;
	@Override
	public String toString() {
		return "CurdBean [id=" + id + ", name=" + name + ", expiryMonth=" + expiryMonth + ", bacteria=" + bacteria
				+ "]";
	}
	public CurdBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}
	
	public CurdBean(int id, String name, String expiryMonth, BacteriaBean bacteria) {
		super();
		this.id = id;
		this.name = name;
		this.expiryMonth = expiryMonth;
		this.bacteria = bacteria;
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
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
	public BacteriaBean getBacteria() {
		return bacteria;
	}
	public void setBacteria(BacteriaBean bacteria) {
		this.bacteria = bacteria;
	}
	

}
