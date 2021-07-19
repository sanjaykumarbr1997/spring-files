package com.xworkz.jet_details.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Component
@ToString
@Getter
@Setter
public class JetBean implements Serializable{
	
	private int id;
	private String name;
	private float maxSpeed;
	public JetBean(@Value(value = "5") int id, @Value(value = "Tejas") String name,@Value(value = "2205") float maxSpeed) {
		super();
		this.id = id;
		this.name = name;
		this.maxSpeed = maxSpeed;
	}
	
	
	

}
