package com.xworkz.bottle_liquid.bean;

import java.io.Serializable;

public class BottleBean implements Serializable {
	private int id;
	private String name;
	private String color;
	private LiquidBean liquid;
	@Override
	public String toString() {
		return "BottleBean [id=" + id + ", name=" + name + ", color=" + color + ", liquid=" + liquid + "]";
	}
	
	public BottleBean() {
		System.out.println(this.getClass().getSimpleName()+" created");
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

	public LiquidBean getLiquid() {
		return liquid;
	}

	public void setLiquid(LiquidBean liquid) {
		this.liquid = liquid;
	}

	
}
