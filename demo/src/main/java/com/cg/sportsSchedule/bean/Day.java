package com.cg.sportsSchedule.bean;

import java.util.List;

public class Day {
	
	private String name;
	private List<Game> games;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Game> getGames() {
		return games;
	}
	public void setGames(List<Game> games) {
		this.games = games;
	}
	@Override
	public String toString() {
		return "Day [name=" + name + ", games=" + games + "]";
	}
	public Day(String name, List<Game> games) {
		super();
		this.name = name;
		this.games = games;
	}

	public Day() {
		super();
		
	}

}
