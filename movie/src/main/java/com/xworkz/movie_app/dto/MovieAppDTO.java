package com.xworkz.movie_app.dto;

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

@Table(name="movie_details")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MovieAppDTO implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="ratings")
	private String ratings;
	@Column(name="type")
	private String type;
	
	


}
