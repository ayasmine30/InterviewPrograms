package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController 
public class AlienController {

	@RequestMapping("aliens")
	public List<Alien> getAliens(){
		
		List<Alien> aliens = new ArrayList<>();
		Alien a1 = new Alien();
		
		a1.setId(1);
		a1.setName("Yasmine");
		a1.setPoints(10);
		
		Alien a2 = new Alien();
		a2.setId(2);
		a2.setName("Chandu");
		a2.setPoints(50);
		
		aliens.add(a1);
		aliens.add(a2);
		
		return aliens;
		
	}
}
