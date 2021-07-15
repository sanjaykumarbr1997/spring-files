package com.xworkz.torch_cell.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TorchBean implements Serializable{
	@Value(value = "3")
	private int id;
	@Value(value = "Every Day")
	private String name;
	@Value(value = "Brown")
	private String color;
	@Autowired
	private CellBean cell;
	
	public TorchBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public CellBean getCell() {
		return cell;
	}

	public void setCell(CellBean cell) {
		this.cell = cell;
	}

	@Override
	public String toString() {
		return "TorchBean [id=" + id + ", name=" + name + ", color=" + color + ", cell=" + cell + "]";
	}
	
	

}
