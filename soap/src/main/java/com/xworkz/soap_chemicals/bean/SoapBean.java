package com.xworkz.soap_chemicals.bean;

import java.io.Serializable;

public class SoapBean implements Serializable {
	private int id;
	private String name;
	private String color;
	private ChemicalsBean chemical;
	@Override
	public String toString() {
		return "SoapBean [id=" + id + ", name=" + name + ", color=" + color + ", chemical=" + chemical + "]";
	}
	public SoapBean() {
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public ChemicalsBean getChemical() {
		return chemical;
	}
	public void setChemical(ChemicalsBean chemical) {
		this.chemical = chemical;
	}

	
}
