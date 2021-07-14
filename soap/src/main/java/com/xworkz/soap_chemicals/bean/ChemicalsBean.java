package com.xworkz.soap_chemicals.bean;

import java.io.Serializable;

public class ChemicalsBean implements Serializable{
	
	private int id;
	private String name;
	private String formula;
	@Override
	public String toString() {
		return "ChemicalsBean [id=" + id + ", name=" + name + ", formula=" + formula + "]";
	}
	public ChemicalsBean() {
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
	public String getFormula() {
		return formula;
	}
	public void setFormula(String formula) {
		this.formula = formula;
	}
	
	

}
