package com.cg.sportsSchedule.bean;

public class Game {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Game(String name) {
		super();
		this.name = name;
	}
	
	public Game() {
		super();
		
	}

	@Override
	public String toString() {
		return "Game [name=" + name + "]";
	}

}
