package com.xworkz.laptop_storage.bean;

import java.io.Serializable;

public class HardDiskBean implements Serializable {
	private int hardDiskId;
	private String hardDiskName;
	private int hardDiskCapacity;
	
	
	public HardDiskBean() {
		System.out.println(this.getClass().getSimpleName() + "created");
	}


	@Override
	public String toString() {
		return "HardDiskBean [hardDiskId=" + hardDiskId + ", hardDiskName=" + hardDiskName + ", hardDiskCapacity(in TB)="
				+ hardDiskCapacity + "]";
	}


	public int getHardDiskId() {
		return hardDiskId;
	}


	public void setHardDiskId(int hardDiskId) {
		this.hardDiskId = hardDiskId;
	}


	public String getHardDiskName() {
		return hardDiskName;
	}


	public void setHardDiskName(String hardDiskName) {
		this.hardDiskName = hardDiskName;
	}


	public int getHardDiskCapacity() {
		return hardDiskCapacity;
	}


	public void setHardDiskCapacity(int hardDiskCapacity) {
		this.hardDiskCapacity = hardDiskCapacity;
	}
	
	
	

}


