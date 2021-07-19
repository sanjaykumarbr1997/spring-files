package com.xworkz.floor_cleaner.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Component
@Getter
@Setter
@ToString
@NoArgsConstructor

public class FloorCleanerBean implements Serializable {
	@Value(value = "33")
	private int id;
	@Value(value = "Domex")
	private String name;
	@Value(value = "120")
	private float price;
	@Autowired
	private Chemical chemical;
	
	

}
