package com.xworkz.cake_app.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component


@ToString
@NoArgsConstructor
public class CakeBean implements Serializable {
	
	private int id;
	private String name;
	private String shape;
	
	private CreamBean cream;
	
	@Autowired
	public CakeBean(@Value(value = "34") int id, @Value(value = "Paestries") String name, @Value(value = "Round") String shape, CreamBean cream) {
		super();
		this.id = id;
		this.name = name;
		this.shape = shape;
		this.cream = cream;
	}
	

}
