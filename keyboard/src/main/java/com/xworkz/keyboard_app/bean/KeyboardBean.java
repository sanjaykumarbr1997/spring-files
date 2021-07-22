package com.xworkz.keyboard_app.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@NoArgsConstructor
public class KeyboardBean implements Serializable {
	@Value(value = "4")
	private int id;
	@Value(value = "Dell")
	private String name;
	@Value(value = "Black")
	private String color;
	@Value(value = "Wireless")
	private String type;

}
