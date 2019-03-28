package io.github.vinopaldimit.monstermatch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.vinopaldimit.monstermatch.models.Profile;
import io.github.vinopaldimit.monstermatch.models.CreatureType;
import io.github.vinopaldimit.monstermatch.repositories.ProfileRepo;
import io.github.vinopaldimit.monstermatch.repositories.CreatureTypeRepo;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private ProfileRepo profileRepo;
	
	@Autowired
	private CreatureTypeRepo creatureTypeRepo;
	
	@GetMapping("/profiles")
	public Iterable<Profile> getProfiles() {
		return profileRepo.findAll();
	}
	
	@GetMapping("/creatureTypes")
	public Iterable<CreatureType> getcreatureTypes() {
		return creatureTypeRepo.findAll();
	}
	
}
