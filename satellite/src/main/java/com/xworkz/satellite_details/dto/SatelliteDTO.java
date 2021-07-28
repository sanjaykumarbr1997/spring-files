package com.xworkz.satellite_details.dto;

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
@Table(name="satellite_details")
@Getter
@Setter
@ToString
@NoArgsConstructor

public class SatelliteDTO implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="launchDate")
	private String launchDate;
	@Column(name="orbitType")
	private String orbitType;
	@Column(name="application")
	private String application;
	
	
}
