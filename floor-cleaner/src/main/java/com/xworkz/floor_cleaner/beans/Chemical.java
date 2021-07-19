package com.xworkz.floor_cleaner.beans;

import java.io.Serializable;

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
public class Chemical implements Serializable{
	@Value(value = "44")
	private int id;
	@Value(value = "NaOCl")
	private String name;
	
	

}
