package com.xworkz.laptop_storage.bean;

public class LaptopBean {
	
	private int id;
	private String name;
	private String version;
	private float price;
	private HardDiskBean hDisk;
	
	public LaptopBean() {
		System.out.println(this.getClass().getSimpleName() +"created");
	}

	@Override
	public String toString() {
		return "LaptopBean [id=" + id + ", name=" + name + ", version=" + version + ", price=" + price + ", hDisk="
				+ hDisk + "]";
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

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public HardDiskBean gethDisk() {
		return hDisk;
	}

	public void sethDisk(HardDiskBean hDisk) {
		this.hDisk = hDisk;
	}

	
}
