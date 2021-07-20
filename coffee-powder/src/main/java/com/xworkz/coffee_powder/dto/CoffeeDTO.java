package com.xworkz.coffee_powder.dto;

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
		@NamedQuery(name = "getAllDetails", query = "from CoffeeDTO dto"),
		@NamedQuery(name = "getDetailsByName", query = "from CoffeeDTO dto where dto.name=:na"),
		@NamedQuery(name = "updatePriceByName", query = "update CoffeeDTO dto set dto.price=:pri where dto.name=:nam"),
		@NamedQuery(name = "deleteDetailsByName", query = "delete from CoffeeDTO dto where dto.name = :name")
		
	})
@Table(name="coffee_details")
@Getter
@Setter
@NoArgsConstructor
@ToString

public class CoffeeDTO implements Serializable {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="price")
	private float price;
	@Column(name="quantity")
	private int quantity;
	
	

}
