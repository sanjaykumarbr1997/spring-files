package com.xworkz.medicine_app.dto;

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
@Table(name="medicine_details")
@Getter
@Setter
@NoArgsConstructor
@ToString


public class MedicineDTO implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private String price;
	@Column(name="quantity")
	private String quantity;
	@Column(name="manufacturer")
	private String manufacturer;
	
	
	
	
}
