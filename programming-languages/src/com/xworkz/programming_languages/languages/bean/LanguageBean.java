package com.xworkz.programming_languages.languages.bean;

import java.io.Serializable;

public class LanguageBean implements Serializable {
	
	private int id;
	private String name;
	private int yearOfRelease;
	private String founder;
	
	public LanguageBean() {
		System.out.println(this.getClass().getSimpleName());
		
	}

	@Override
	public String toString() {
		return "LanguageBean [id=" + id + ", name=" + name + ", yearOfRelease=" + yearOfRelease + ", founder=" + founder
				+ "]";
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

	public int getYearOfRelease() {
		return yearOfRelease;
	}

	public void setYearOfRelease(int yearOfRelease) {
		this.yearOfRelease = yearOfRelease;
	}

	public String getFounder() {
		return founder;
	}

	public void setFounder(String founder) {
		this.founder = founder;
	}
	

}
