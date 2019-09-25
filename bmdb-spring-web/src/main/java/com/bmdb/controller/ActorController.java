package com.bmdb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmdb.model.Actor;
import com.bmdb.model.ActorRepository;

@RestController			// RestControllers convert things to JSON
@RequestMapping("/actors")	// java:  localhost:8080
public class ActorController {
	
	@Autowired
	private ActorRepository actorRepo;
	
	@GetMapping("/")
	public Iterable<Actor> getAll() {
		return actorRepo.findAll();
	}
	
	
	

	
	
}
