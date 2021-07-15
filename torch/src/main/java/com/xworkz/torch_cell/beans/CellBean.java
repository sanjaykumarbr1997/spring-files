package com.xworkz.torch_cell.beans;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class CellBean implements Serializable {
	@Value(value = "14")
	private int cellId;
	@Value(value = "Nippon")
	private String name;
	
	public CellBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
	}

	public int getCellId() {
		return cellId;
	}

	public void setCellId(int cellId) {
		this.cellId = cellId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CellBean [cellId=" + cellId + ", name=" + name + "]";
	}
	

}
