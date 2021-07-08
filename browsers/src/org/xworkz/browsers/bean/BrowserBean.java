package org.xworkz.browsers.bean;

import java.io.Serializable;

public class BrowserBean implements Serializable {
	
	private int id;
	private String name;
	private int yearOfRelease;
	private int noOfLanguagesAvailable;
	private String developers;
	
	public BrowserBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
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

	public int getNoOfLanguagesAvailable() {
		return noOfLanguagesAvailable;
	}

	public void setNoOfLanguagesAvailable(int noOfLanguagesAvailable) {
		this.noOfLanguagesAvailable = noOfLanguagesAvailable;
	}

	public String getDevelopers() {
		return developers;
	}

	public void setDevelopers(String developers) {
		this.developers = developers;
	}
	
	public void displayAllBrowser() {
		System.out.println("id:"+getId()+" name:"+getName()+" year of release:"+getYearOfRelease()+" no of langauges available in:"+getNoOfLanguagesAvailable()+" developers:"+getDevelopers());
	}

}
