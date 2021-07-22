package com.xworkz.music_instruments.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="music_instruments_table")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class MusicInstrumentsDTO implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private float price;
	@Column(name="color")
	private String color;

}
