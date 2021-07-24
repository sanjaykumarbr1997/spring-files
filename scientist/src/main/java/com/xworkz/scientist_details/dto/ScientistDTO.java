package com.xworkz.scientist_details.dto;

import java.io.Serializable;

import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
public class ScientistDTO implements Serializable{
	
	@Id
	private int id;
	private String name;
	private String discovery;
	private String nobelPrizeYear;
	

}
