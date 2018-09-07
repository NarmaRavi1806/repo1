package com.cg.sportsSchedule.app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.sportsSchedule.bean.Day;
import com.cg.sportsSchedule.bean.Game;

@Configuration
@ComponentScan(basePackages="com.cg.sportsSchedule")
public class AppConfig {
	
	 public AppConfig() {
	   }


	   @Bean
	   public Map<String, Day> getCompositesMap() {
		   
		   Map<String, Day> map=new HashMap<String, Day>();
		   
		   Game gm1=new Game();
			gm1.setName("Tennis");
			Game gm2=new Game();
			gm2.setName("LongJump");
			Game gm3=new Game();
			gm3.setName("KhoKho");
			Game gm4=new Game();
			gm4.setName("HighJump");
			Game gm5=new Game();
			gm5.setName("Relay");
		   
		   Day d=new Day();
		   d.setName("Day6");
		   List<Game> games=new ArrayList<Game>();
		   games.add(gm3);
		   games.add(gm2);
		   d.setGames(games);
		   
		   map.put(d.getName(), d);
		   
	      return map;
	   }
	}


