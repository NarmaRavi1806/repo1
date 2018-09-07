package com.cg.sportsSchedule.service;

import java.util.ArrayList;
import java.util.List;

import com.cg.sportsSchedule.bean.Day;
import com.cg.sportsSchedule.bean.Game;
import com.cg.sportsSchedule.dao.SportRepoImpl;
import com.cg.sportsSchedule.dao.SportsRepo;

public class SportsServiceImpl implements SportsService {
	
	private SportsRepo repo;
	
	

	public SportsServiceImpl(SportsRepo repo) {
		super();
		this.repo = repo;
	}

	@Override
	public Day addDay(Day d) {

		return repo.save(d);
	}

	@Override
	public Day findByDay(String name) {
		
		return repo.findByDayName(name);
	}

	@Override
	public List<Day> findByGame(String name) {
		
		return repo.findByGameName(name);
	}

}
