package com.xworkz.airport_terminals.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class AirportBean implements Serializable {
	@Value(value = "2")
	private int id;
	@Value(value = "Bangalore International Airport")
	private String name;
	@Value(value = "International")
	private String type;
	@Autowired
	private TerminalsBean terminal;
	
	public AirportBean() {
		System.out.println(this.getClass().getSimpleName()+ " created");
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TerminalsBean getTerminal() {
		return terminal;
	}

	public void setTerminal(TerminalsBean terminal) {
		this.terminal = terminal;
	}

	@Override
	public String toString() {
		return "AirportBean [id=" + id + ", name=" + name + ", type=" + type + ", terminal=" + terminal + "]";
	}
	

}
