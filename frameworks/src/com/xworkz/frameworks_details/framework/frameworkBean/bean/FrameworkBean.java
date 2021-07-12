package com.xworkz.frameworks_details.framework.frameworkBean.bean;

import java.io.Serializable;

public class FrameworkBean implements Serializable{
	
	private int id;
	private String name;
	private String implementationOf;
	private String typeOfFramework;
	
	public FrameworkBean() {
		System.out.println(this.getClass().getSimpleName());
	}

	@Override
	public String toString() {
		return "FrameworkBean [id=" + id + ", name=" + name + ", implementationOf=" + implementationOf
				+ ", typeOfFramework=" + typeOfFramework + "]";
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

	public String getImplementationOf() {
		return implementationOf;
	}

	public void setImplementationOf(String implementationOf) {
		this.implementationOf = implementationOf;
	}

	public String getTypeOfFramework() {
		return typeOfFramework;
	}

	public void setTypeOfFramework(String typeOfFramework) {
		this.typeOfFramework = typeOfFramework;
	}
	
	
	

}
