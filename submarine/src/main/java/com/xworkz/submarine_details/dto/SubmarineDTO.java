package com.xworkz.submarine_details.dto;

import java.io.Serializable;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Getter
@Setter
@NoArgsConstructor
@ToString

public class SubmarineDTO implements Serializable{
	
	private int id;
	private String name;
	private String classType;
	private String displacement;
	

}
