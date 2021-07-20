package com.xworkz.graphic_card.dto;

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
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@NamedQueries(value = {
		@NamedQuery(name = "getAllDetails", query = "from GraphicCardDTO dto"),
		@NamedQuery(name = "fetchDetailsByName", query = "from GraphicCardDTO dto where dto.name=:nam"),
		@NamedQuery(name = "updatePriceByName", query = "update GraphicCardDTO dto set dto.price =:prr where dto.name =:naa")
		

})
@Table(name="graphic_card_table")
public class GraphicCardDTO implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private int id;
	@Column(name="name")
	private String name;
	@Column(name="version")
	private String version;
	@Column(name="price")
	private float price;
	
	

}
