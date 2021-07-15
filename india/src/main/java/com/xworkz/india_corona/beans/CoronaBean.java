package com.xworkz.india_corona.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CoronaBean implements Serializable {
	
	@Value(value = "2")
	private int id;
	@Value(value = "Delta")
	private String variant;
	@Value(value = "Covishield")
	private String vaccine;
	
	public CoronaBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	@Override
	public String toString() {
		return "CoronaBean [id=" + id + ", variant=" + variant + ", vaccine=" + vaccine + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVariant() {
		return variant;
	}

	public void setVariant(String variant) {
		this.variant = variant;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	
	

}
