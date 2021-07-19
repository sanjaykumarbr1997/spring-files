package com.xworkz.mouse_app.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.NoArgsConstructor;
import lombok.ToString;
@ToString
@NoArgsConstructor
@Component("mus")
public class MouseBean implements Serializable {
	private int id;
	private String name;
	private String color;
	
	public int getId() {
		return id;
	}
	@Value(value = "3")
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	@Value(value = "Dell")
	public void setName(String name) {
		this.name = name;
	}
	
	public String getColor() {
		return color;
	}
	@Value(value = "Black")
	public void setColor(String color) {
		this.color = color;
	}
	

}
