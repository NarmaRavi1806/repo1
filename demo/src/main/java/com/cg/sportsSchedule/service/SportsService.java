package com.cg.sportsSchedule.service;

import java.util.List;

import com.cg.sportsSchedule.bean.Day;

public interface SportsService {

	public Day addDay(Day d);
	public Day findByDay(String name);
	public List<Day> findByGame(String name);
}
