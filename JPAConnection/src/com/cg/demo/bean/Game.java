package com.cg.demo.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Game {
	
	@Id
	@GeneratedValue
	private int gId;
	private String gameName;
	public int getgId() {
		return gId;
	}
	public void setgId(int gId) {
		this.gId = gId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	
	
	public Game(int gId, String gameName) {
		super();
		this.gId = gId;
		this.gameName = gameName;
	}
	
	public Game() {
		super();
	}
	
	
	@Override
	public String toString() {
		return "Game [gId=" + gId + ", gameName=" + gameName + "]";
	}
	
	

}
