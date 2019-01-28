package io.github.vinopaldimit.monstermatch.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.vinopaldimit.monstermatch.models.MonsterProfile;
import io.github.vinopaldimit.monstermatch.models.MonsterType;
import io.github.vinopaldimit.monstermatch.repositories.MonsterProfileRepo;
import io.github.vinopaldimit.monstermatch.repositories.MonsterTypeRepo;

@CrossOrigin
@RestController
@RequestMapping("/api")
public class ApiController {

	@Autowired
	private MonsterProfileRepo monsterProfileRepo;
	
	@Autowired
	private MonsterTypeRepo monsterTypeRepo;
	
	@GetMapping("/monsterProfiles")
	public Iterable<MonsterProfile> getMonsterProfiles() {
		return monsterProfileRepo.findAll();
	}
	
	@GetMapping("/monsterTypes")
	public Iterable<MonsterType> getMonsterTypes() {
		return monsterTypeRepo.findAll();
	}
	
}
