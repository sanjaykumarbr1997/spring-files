package com.xworkz.ketchup_app.bean;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@NoArgsConstructor
public class KetchupBean implements Serializable {
	@Value(value = "5")
	private int id;
	@Value(value = "Nestle")
	private String name;
	@Value(value = "344")
	private float price;
	@Value(value = "250")
	private int quantity;
		

}
