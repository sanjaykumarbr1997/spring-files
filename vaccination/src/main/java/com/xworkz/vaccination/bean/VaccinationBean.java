package com.xworkz.vaccination.bean;

import java.io.Serializable;

public class VaccinationBean implements Serializable{
	
	private int id;
	private String location;
	private String city;
	private String noOfPeopleVaccinated;
	
	public VaccinationBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getNoOfPeopleVaccinated() {
		return noOfPeopleVaccinated;
	}

	public void setNoOfPeopleVaccinated(String noOfPeopleVaccinated) {
		this.noOfPeopleVaccinated = noOfPeopleVaccinated;
	}
	
	

}
