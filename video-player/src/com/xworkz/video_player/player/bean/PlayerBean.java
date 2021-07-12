package com.xworkz.video_player.player.bean;

import java.io.Serializable;

public class PlayerBean implements Serializable {
	
	private int id;
	private String name;
	private String langaugesAvailable;
	private int ratings;
	
	
	
	@Override
	public String toString() {
		return "PlayerBean [id=" + id + ", name=" + name + ", langaugesAvailable=" + langaugesAvailable + ", ratings="
				+ ratings + "]";
	}
	public PlayerBean(int id, String name, String langaugesAvailable, int ratings) {
		this.id = id;
		this.name = name;
		this.langaugesAvailable = langaugesAvailable;
		this.ratings = ratings;
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
	public String getLangaugesAvailable() {
		return langaugesAvailable;
	}
	public void setLangaugesAvailable(String langaugesAvailable) {
		this.langaugesAvailable = langaugesAvailable;
	}
	public int getRatings() {
		return ratings;
	}
	public void setRatings(int ratings) {
		this.ratings = ratings;
	}
	
	

}
