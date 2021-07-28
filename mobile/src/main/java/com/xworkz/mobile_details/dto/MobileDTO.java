package com.xworkz.mobile_details.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity

@NamedQueries(value = { 
		@NamedQuery(name = "updateColor", query = "update MobileDTO dto set dto.color = :cl where dto.name = :nams "),
		@NamedQuery(name = "deleteName", query = "delete from MobileDTO dto where dto.name =:nam")
		})
@Table(name="mobileeeeee_details")
@Getter
@Setter
@ToString
@NoArgsConstructor
public class MobileDTO  implements Serializable{
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="color")
	private String color;
	@Column(name="price")
	private float price;
	

}
