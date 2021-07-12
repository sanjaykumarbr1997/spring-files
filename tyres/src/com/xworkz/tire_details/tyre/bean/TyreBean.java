package com.xworkz.tire_details.tyre.bean;

import java.io.Serializable;

public class TyreBean implements Serializable {
	
	private int id;
	private String name;
	private int size;
	private boolean tubeless;
	
	public TyreBean() {
		System.out.println(this.getClass().getSimpleName() +" created");
	}
	

	public TyreBean(int id, String name, int size, boolean tubeless) {
	
		this.id = id;
		this.name = name;
		this.size = size;
		this.tubeless = tubeless;
	}


	@Override
	public String toString() {
		return "TyreBean [id=" + id + ", name=" + name + ", size=" + size + ", tubeless=" + tubeless + "]";
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

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public boolean isTubeless() {
		return tubeless;
	}

	public void setTubeless(boolean tubeless) {
		this.tubeless = tubeless;
	}
	
	

}
