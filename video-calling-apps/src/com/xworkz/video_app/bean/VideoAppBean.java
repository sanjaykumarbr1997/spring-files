package com.xworkz.video_app.bean;

import java.io.Serializable;

public class VideoAppBean implements Serializable{
	
	private int id;
	private String name;
	private int size;
	private int maxNoOfParticipants;
	
	public VideoAppBean() {
		System.out.println(this.getClass().getSimpleName() +"created");
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getMaxNoOfParticipants() {
		return maxNoOfParticipants;
	}

	public void setMaxNoOfParticipants(int maxNoOfParticipants) {
		this.maxNoOfParticipants = maxNoOfParticipants;
	}
	
	public void displayAll() {
		System.out.println("id:"+getId()+"  name:"+getName()+"  size:"+getSize()+" mb "+" max no of participants:"+getMaxNoOfParticipants());
	}
	

}
