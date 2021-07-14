package com.xworkz.cricket_player.beans;

import java.io.Serializable;

public class PlayersBean implements Serializable {
	private int id;
	private String name;
	@Override
	public String toString() {
		return "PlayersBean [id=" + id + ", name=" + name + "]";
	}
	public PlayersBean(int id, String name) {
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
