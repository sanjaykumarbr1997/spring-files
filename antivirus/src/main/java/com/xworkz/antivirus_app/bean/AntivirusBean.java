package com.xworkz.antivirus_app.bean;

import java.io.Serializable;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
//@NoArgsConstructor
@ToString
public class AntivirusBean implements Serializable {
	
	
	private int id;
	private String name;
	private int releaseYear;
	
	public AntivirusBean() {
		
	}
	@PostConstruct
	void initIDs() {
		System.out.println("initialisation occured");
	}
	

}
