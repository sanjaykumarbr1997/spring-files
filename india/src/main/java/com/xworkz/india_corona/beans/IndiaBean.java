package com.xworkz.india_corona.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class IndiaBean implements Serializable {
	@Value(value = "2")
	private int id;
	@Value(value = "4000")
	private int noOfHospitals;
	@Value(value = "136.64")
	private float noOfPopulation;
	@Autowired
	private CoronaBean corona;
	
	public IndiaBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoOfHospitals() {
		return noOfHospitals;
	}

	public void setNoOfHospitals(int noOfHospitals) {
		this.noOfHospitals = noOfHospitals;
	}

	public float getNoOfPopulation() {
		return noOfPopulation;
	}

	public void setNoOfPopulation(float noOfPopulation) {
		this.noOfPopulation = noOfPopulation;
	}

	public CoronaBean getCorona() {
		return corona;
	}

	public void setCorona(CoronaBean corona) {
		this.corona = corona;
	}

	@Override
	public String toString() {
		return "IndiaBean [id=" + id + ", noOfHospitals=" + noOfHospitals + ", noOfPopulation(in crores)=" + noOfPopulation
				+ ", corona=" + corona + "]";
	}
	
	
	
	
	

}
