package com.cg.demo.bean;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Day {
	
	@Id
	@GeneratedValue
	private int id;
	private String dayName;
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	private List<Game> game;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDayName() {
		return dayName;
	}
	public void setDayName(String dayName) {
		this.dayName = dayName;
	}
	public List<Game> getGame() {
		return game;
	}
	public void setGame(List<Game> game) {
		this.game = game;
	}
	public Day(int id, String dayName, List<Game> game) {
		super();
		this.id = id;
		this.dayName = dayName;
		this.game = game;
	}
	
	public Day() {
		super();
		
	}
	@Override
	public String toString() {
		return "Day [id=" + id + ", dayName=" + dayName + ", game=" + game + "]";
	}
	
	

}
