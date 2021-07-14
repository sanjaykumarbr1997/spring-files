package com.xworkz.curd_bacteria.beans;

public class BacteriaBean {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "BacteriaBean [id=" + id + ", name=" + name + "]";
	}
	
	public BacteriaBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}
	

	public BacteriaBean(int id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	

}
