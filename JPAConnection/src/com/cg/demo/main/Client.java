package com.cg.demo.main;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.demo.bean.Day;
import com.cg.demo.bean.Game;
import com.cg.demo.service.ServiceImpl;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("hello");
		
		
		EntityManager em = emf.createEntityManager();
		
		ServiceImpl service=new ServiceImpl(em);
		
		Game gm1=new Game();
		gm1.setGameName("Tennis");
		Game gm2=new Game();
		gm2.setGameName("BallBadminton");
		Game gm3=new Game();
		gm3.setGameName("KhoKho");
		Game gm4=new Game();
		gm4.setGameName("Chess");
		Game gm5=new Game();
		gm5.setGameName("Hurdles");
		Game gm6=new Game();
		gm6.setGameName("Relay");
		Game gm7=new Game();
		gm7.setGameName("LongJump");
		
		
		List<Game> game=new ArrayList<Game>();
		game.add(gm1);
		game.add(gm2);
		
		
		List<Game> game1=new ArrayList<Game>();
		game1.add(gm4);
		game1.add(gm3);
		game1.add(gm5);
		game1.add(gm1);
		
		List<Game> game2=new ArrayList<Game>();
		game2.add(gm1);
		game2.add(gm4);
		game2.add(gm6);
		game2.add(gm7);
		
		List<Game> game3=new ArrayList<Game>();
		game3.add(gm7);
		
		
		List<Game> game4=new ArrayList<Game>();
		game4.add(gm1);
		game4.add(gm2);
		game4.add(gm3);
		game4.add(gm6);
		
		//em.getTransaction().begin();
		//Day d1=service.addDay("Day1", game);
		//Day d2=service.addDay("Day2", game1);
		//Day d3=service.addDay("Day3", game2);
	    //Day d4=service.addDay("Day4", game3);
		//Day d5=service.addDay("Day5", game4);
//		em.getTransaction().commit();
//		System.out.println("Persisted "+d5);
		
		em.getTransaction().begin();
		Day d1=service.findByDayName("Day1");
		em.getTransaction().commit();
		
		System.out.println(d1);
		
		List<Day> dayList=service.findByGameName("Tennis");
		for (Day day : dayList) {
			System.out.println(day.getDayName()); 
		}
		
		emf.close();
		em.close();
		
	}

}
