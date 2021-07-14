package com.xworkz.human_heart.bean;

import java.io.Serializable;

public class HumanBean implements Serializable {
	
	private int id;
	private String name;
	private String gender;
	private HeartBean heart;
	@Override
	public String toString() {
		return "HumanBean [id=" + id + ", name=" + name + ", gender=" + gender + ", heart=" + heart + "]";
	}
	
	public HumanBean() {
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public HeartBean getHeart() {
		return heart;
	}

	public void setHeart(HeartBean heart) {
		this.heart = heart;
	}
	

}
