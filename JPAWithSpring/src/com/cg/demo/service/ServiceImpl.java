package com.cg.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.demo.bean.Day;
import com.cg.demo.bean.Game;
import com.cg.demo.repo.SportsRepo;

@Service(value="service")
public class ServiceImpl {

	@Autowired
	private SportsRepo repo;


	public Day addDay(String day,List<Game> g) {


		return repo.addDay(day, g);
	}

	public Day findByDayName(String name) {

		return  repo.findByDayName(name);

	}

	public List<Day> findByGameName(String name){


		return repo.findByGameName(name);

	}

}
