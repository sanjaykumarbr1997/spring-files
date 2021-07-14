package com.xworkz.gun_details.gun.bean;

import java.io.Serializable;
import java.util.Arrays;

public class GunBean implements Serializable{
	
	private int id;
	private String name;
	private float range;
	private float recoilSpeed;
	private float price;
	private String [] otherGuns;
	
	public String[] getOtherGuns() {
		return otherGuns;
	}

	public void setOtherGuns(String[] otherGuns) {
		this.otherGuns = otherGuns;
	}

	public GunBean(){
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	

	@Override
	public String toString() {
		return "GunBean [id=" + id + ", name=" + name + ", range=" + range + ", recoilSpeed=" + recoilSpeed + ", price="
				+ price + "]";
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

	public float getRange() {
		return range;
	}

	public void setRange(float range) {
		this.range = range;
	}

	public float getRecoilSpeed() {
		return recoilSpeed;
	}

	public void setRecoilSpeed(float recoilSpeed) {
		this.recoilSpeed = recoilSpeed;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	
	

	
}
