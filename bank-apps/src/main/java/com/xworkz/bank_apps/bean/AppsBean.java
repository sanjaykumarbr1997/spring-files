package com.xworkz.bank_apps.bean;

public class AppsBean {
	
	private int id;
	private String name;
	private float size;
	
	public AppsBean() {
		System.out.println(this.getClass().getSimpleName()+ "created");
	}

	@Override
	public String toString() {
		return "AppsBean [id=" + id + ", name=" + name + ", size=" + size + "]";
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

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}

	
}
