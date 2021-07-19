package com.xworkz.hat_app.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
@Getter
@Setter
@ToString
@Component
public class HatBean implements Serializable {
	@Value(value = "4")
	private int id;
	@Value(value = "Puma")
	private String name;
	@Value(value = "Red")
	private String color;
	
	public HatBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}
	
	
}

