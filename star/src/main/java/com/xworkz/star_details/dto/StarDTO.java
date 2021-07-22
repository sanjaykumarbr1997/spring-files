package com.xworkz.star_details.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="star_details")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class StarDTO implements Serializable{
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name = "common_name")
	private String commonName;
	@Column(name= "scientific_name")
	private String scientificName;
	@Column(name = "distance_in_lightyears")
	private String distanceInLightYears;
	
	
	

}
