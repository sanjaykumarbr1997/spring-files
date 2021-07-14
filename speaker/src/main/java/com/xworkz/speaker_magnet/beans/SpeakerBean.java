package com.xworkz.speaker_magnet.beans;

import java.io.Serializable;

public class SpeakerBean implements Serializable {
	
	private int id;
	private String name;
	private String color;
	private MagnetBean magnet;
	@Override
	public String toString() {
		return "SpeakerBean [id=" + id + ", name=" + name + ", color=" + color + ", magnet=" + magnet + "]";
	}
	public SpeakerBean(int id, String name, String color, MagnetBean magnet) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.magnet = magnet;
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
	public MagnetBean getMagnet() {
		return magnet;
	}
	public void setMagnet(MagnetBean magnet) {
		this.magnet = magnet;
	}
	
	

}
