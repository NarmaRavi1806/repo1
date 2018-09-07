package com.cg.sportsSchedule.mainUi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.springframework.context.support.GenericXmlApplicationContext;

import com.cg.sportsSchedule.bean.Day;
import com.cg.sportsSchedule.bean.Game;
import com.cg.sportsSchedule.dao.SportRepoImpl;
import com.cg.sportsSchedule.dao.SportsRepo;
import com.cg.sportsSchedule.service.SportsService;
import com.cg.sportsSchedule.service.SportsServiceImpl;

public class Client {
	//SportsService service =new SportsServiceImpl(repo);
//	Scanner sc= new Scanner(System.in);
//	GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("beanConfig.xml");
//	SportsService service=ctx.getBean("service",SportsService.class);
//	Map<String, Day> sportsMap=new HashMap<String, Day>();
//	SportsRepo repo = new SportRepoImpl(sportsMap);
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		GenericXmlApplicationContext ctx=new GenericXmlApplicationContext("beanConfig.xml");
		SportsService service=ctx.getBean("service",SportsService.class);
		SportsService service1=ctx.getBean("service",SportsService.class);

		//System.out.println(day9);
		if(service==service1) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
		
//		Client c=new Client();
//		String op="";
//		while(true) {
//			System.out.println("1. Store Day Events");
//			System.out.println("2. Retrieve Info By Day");
//			System.out.println("3. Retrieve Info By Day");
//			System.out.println("4. Exit");
//			op=c.sc.nextLine();
//			
//			switch (op) {
//			case "1":
//				
//				c.storeDay();
//				
//				break;
//			case "2":
//				
//				c.retrieveByDay();
//				
//				break;
//			case "3":
//				
//				c.retrieveByGame();
//	
//				break;
//			case "4":
//				
//				System.exit(0);
//	
//				break;
//
//			default:
//				
//				System.out.println("Enter Valid Option");
//				
//				break;
//			}
//		}
//
//	}
//	public void storeDay() {
		//Day d5=ctx.getBean("dayName",Day.class);
		Day d1=new Day();
		Day d2=new Day();
		Day d3=new Day();
		Day d4=new Day();
		
		Game gm1=new Game();
		gm1.setName("Tennis");
		Game gm2=new Game();
		gm2.setName("BallBadminton");
		Game gm3=new Game();
		gm3.setName("KhoKho");
		Game gm4=new Game();
		gm4.setName("Chess");
		Game gm5=new Game();
		gm5.setName("Hurdles");
		Game gm6=new Game();
		gm6.setName("Relay");
		Game gm7=new Game();
		gm7.setName("LongJump");

		
		d1.setName("Day1");
		List<Game> g1=new ArrayList<>();
		g1.add(gm1);
		g1.add(gm5);
		g1.add(gm4);
		g1.add(gm3);
		d1.setGames(g1);
		System.out.println(service.addDay(d1).getName() + " Scheduled");
		
		
		d2.setName("Day2");
		List<Game> g2=new ArrayList<>();
		g2.add(gm7);
		g2.add(gm2);
		d2.setGames(g2);
		System.out.println(service.addDay(d2).getName() + " Scheduled");
		
		d3.setName("Day3");
		List<Game> g3=new ArrayList<>();
		g3.add(gm3);
		g3.add(gm6);
		g3.add(gm1);
		g3.add(gm4);
		d3.setGames(g3);
		System.out.println(service.addDay(d3).getName() + " Scheduled");
		
		d4.setName("Day4");
		List<Game> g4=new ArrayList<>();
		g4.add(gm5);
		g4.add(gm7);
		g4.add(gm1);
		g4.add(gm2);
		g4.add(gm3);
		d4.setGames(g4);
		System.out.println(service.addDay(d4).getName() + " Scheduled");
		
		
		
		 service.addDay(d1);
		 service.addDay(d2);
		 service.addDay(d3);
		 service.addDay(d4);
		 
//			}
//	private void retrieveByDay() {

		String dayName = "";
		System.out.println("Enter Day:");
		dayName = sc.nextLine();
		Day day = service.findByDay(dayName);
		Day day1 = service1.findByDay(dayName);
		System.out.println(day.getGames());
		System.out.println(day1.getGames());

	//}

//	private void retrieveByGame() {

		
		String gName = "";
		System.out.println("Enter Game:");
		gName = sc.nextLine();
		List<Day> dayList = service.findByGame(gName);
		List<Day> dayList1 = service.findByGame(gName);

		for (Day day2 : dayList) {
			System.out.println(day2.getName());
		}
		for (Day day2 : dayList1) {
			System.out.println(day2.getName());
		}
	}
}
