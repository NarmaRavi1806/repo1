package com.cg.sportsSchedule.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Repository;

import com.cg.sportsSchedule.bean.Day;
import com.cg.sportsSchedule.bean.Game;

@Repository
public class SportRepoImpl implements SportsRepo {
	
	
	@Resource(name="map")
	private Map<String, Day> sportsMap;
	
	public SportRepoImpl(Map<String, Day> sportsMap) {
		super();
		this.sportsMap = sportsMap;
	}
	
	
	public SportRepoImpl() {
		super();
	}

	
	@Override
	public Day save(Day day) {
		
		sportsMap.put(day.getName(), day);
		return day;
	

	}

	@Override
	public Day findByDayName(String name) {
		if (sportsMap.containsKey(name)) {
			return sportsMap.get(name);
		} else {
			return null;
		}
	}

	@Override
	public List<Day> findByGameName(String name) {
		List<Day> dayList = new ArrayList<Day>();
		for (Day day : sportsMap.values()) {
			List<Game> list = day.getGames();
			for (Game g : list) {
				if(g.getName().equals(name)){
					
					dayList.add(day);
					
				}
			}
		}
		return dayList;
	}

}
