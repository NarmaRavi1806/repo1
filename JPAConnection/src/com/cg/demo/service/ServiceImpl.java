package com.cg.demo.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import com.cg.demo.bean.Day;
import com.cg.demo.bean.Game;

public class ServiceImpl {
	
	protected EntityManager em;
	
	
	public ServiceImpl(EntityManager em){

			this.em=em;
		
	}
	
	public Day addDay(String day,List<Game> g) {
		Day d= new Day();
		
		
		d.setDayName(day);
		d.setGame(g);
		
		em.persist(d);
	
		return d;
	}
	
	public Day findByDayName(String name) {
		Day d1=new Day();
		TypedQuery<Day> q=em.createQuery("SELECT d FROM Day d where d.dayName=?1",Day.class);
		q.setParameter(1, name);
		em.find(Day.class, 1);	
		return  q.getSingleResult();
	}
	
	public List<Day> findByGameName(String name){

		em.getTransaction().begin();
		TypedQuery<Day> q1=em.createQuery("SELECT d FROM Day d INNER JOIN d.Game g WHERE g.gameName=:n",Day.class);
		q1.setParameter("n", name);
		
		//em.find(Day.class, 1);
		List<Day> res=q1.getResultList();
		em.getTransaction().commit();
		return res;
	
	}

}
