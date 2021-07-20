package com.xworkz.window_glass.beans;
import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Component
public class WindowBean implements Serializable{
	
	
	
	@Value(value = "2")
	private int id;
	@Value(value = "GreenPly")
	private String name;
	@Value(value = "wood")
	private String type;
	@Autowired
	private GlassBean glass;
	
	public WindowBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

}
