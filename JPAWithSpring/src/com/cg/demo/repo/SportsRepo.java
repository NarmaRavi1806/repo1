package com.cg.demo.repo;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.demo.bean.Day;
import com.cg.demo.bean.Game;

@Repository
public class SportsRepo {

	@PersistenceContext	
	protected EntityManager em;
	


	@Transactional
	public Day addDay(String day,List<Game> g) {
		Day d= new Day();


		//utx.begin();
		d.setDayName(day);
		d.setGame(g);

		em.merge(d);
		//utx.commit();

		return d;
	}

	
	public Day findByDayName(String name) {
		//Day d1=new Day();
		//utx.begin();
		TypedQuery<Day> q=em.createQuery("SELECT d FROM Day d where d.dayName=?1",Day.class);
		q.setParameter(1, name);
		em.find(Day.class, 1);	
		//utx.commit();
		return  q.getSingleResult();
	}

	
	public List<Day> findByGameName(String name){

		TypedQuery<Day> q1=(TypedQuery<Day>) em.createQuery("SELECT d FROM Day d INNER JOIN d.game g WHERE g.gameName=:n",Day.class);
		q1.setParameter("n", name);
		
		//em.find(Day.class, 1);
		List<Day> res=q1.getResultList();
		
		return res;

	}


}
