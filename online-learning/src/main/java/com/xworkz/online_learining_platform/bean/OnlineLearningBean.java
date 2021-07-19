package com.xworkz.online_learining_platform.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class OnlineLearningBean implements Serializable {
	
	private int id;
	private String name;
	private int noOfCourses;
	
	@PostConstruct
	public void initIDs() {
		System.out.println("init methos is initialised");
	}

	@PreDestroy
	public void destroyIDs() {
		System.out.println("destroy method is in action");
	}
}
