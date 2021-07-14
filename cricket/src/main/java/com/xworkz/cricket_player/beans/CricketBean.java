package com.xworkz.cricket_player.beans;

import java.io.Serializable;

public class CricketBean implements Serializable {
	private int id;
	private String typeOfGame;
	private String playedFirstIn;
	private PlayersBean players;
	@Override
	public String toString() {
		return "CricketBean [id=" + id + ", typeOfGame=" + typeOfGame + ", playedFirstIn=" + playedFirstIn
				+ ", players=" + players + "]";
	}
	public CricketBean(int id, String typeOfGame, String playedFirstIn, PlayersBean players) {
		super();
		this.id = id;
		this.typeOfGame = typeOfGame;
		this.playedFirstIn = playedFirstIn;
		this.players = players;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTypeOfGame() {
		return typeOfGame;
	}
	public void setTypeOfGame(String typeOfGame) {
		this.typeOfGame = typeOfGame;
	}
	public String getPlayedFirstIn() {
		return playedFirstIn;
	}
	public void setPlayedFirstIn(String playedFirstIn) {
		this.playedFirstIn = playedFirstIn;
	}
	public PlayersBean getPlayers() {
		return players;
	}
	public void setPlayers(PlayersBean players) {
		this.players = players;
	}
	
	
	
	

}
