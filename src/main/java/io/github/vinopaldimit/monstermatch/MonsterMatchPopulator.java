package io.github.vinopaldimit.monstermatch;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import io.github.vinopaldimit.monstermatch.models.Profile;
import io.github.vinopaldimit.monstermatch.models.CreatureType;
import io.github.vinopaldimit.monstermatch.repositories.ProfileRepo;
import io.github.vinopaldimit.monstermatch.repositories.CreatureTypeRepo;

@Service
public class MonsterMatchPopulator implements CommandLineRunner {

	@Resource
	ProfileRepo profileRepo;

	@Resource
	CreatureTypeRepo creatureTypeRepo;

	@Override
	public void run(String... args) throws Exception {
		CreatureType typeOne = new CreatureType("Vampire");
		CreatureType typeTwo = new CreatureType("Werewolf");
		
		//TODO update this
		Profile profileOne = new Profile("Vlad", "12000", "bloodMan69", "oneAhAhAh", "Unknown", typeOne);
		
		creatureTypeRepo.save(typeOne);
		creatureTypeRepo.save(typeTwo);
		profileRepo.save(profileOne);
	}

}
