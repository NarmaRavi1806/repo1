package com.cg.sportsSchedule.dao;

import java.util.List;
import java.util.Map;

import com.cg.sportsSchedule.bean.Day;

public interface SportsRepo {
	
	public void setSportsMap(Map<String, Day> sportsMap);
	
	public Day save(Day day);
	public Day findByDayName(String name);
	public List<Day> findByGameName(String name);

}
