package com.xworkz.online_classes_details.online_classes.bean;

import java.io.Serializable;

public class OnlineClassesBean implements Serializable{
	
	private int id;
	private String subject;
	private String teacherName;
	private float duration;
	private int noOfAssignments;
	private String [] otherGuns;
	
	public OnlineClassesBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
	}
	
	

	@Override
	public String toString() {
		return "OnlineClassesBean [id=" + id + ", subject=" + subject + ", teacherName=" + teacherName + ", duration="
				+ duration + ", noOfAssignments=" + noOfAssignments + "]";
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public float getDuration() {
		return duration;
	}

	public void setDuration(float duration) {
		this.duration = duration;
	}



	public int getNoOfAssignments() {
		return noOfAssignments;
	}



	public void setNoOfAssignments(int noOfAssignments) {
		this.noOfAssignments = noOfAssignments;
	}

	
	
}
