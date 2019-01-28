package io.github.vinopaldimit.monstermatch;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import io.github.vinopaldimit.monstermatch.models.MonsterProfile;
import io.github.vinopaldimit.monstermatch.models.MonsterType;
import io.github.vinopaldimit.monstermatch.repositories.MonsterProfileRepo;
import io.github.vinopaldimit.monstermatch.repositories.MonsterTypeRepo;

@Service
public class MonsterMatchPopulator implements CommandLineRunner {
	
	@Resource
	MonsterProfileRepo monsterProfileRepo;
	
	@Resource
	MonsterTypeRepo monsterTypeRepo;
	
	@Override
	public void run(String... args) throws Exception {
		MonsterType typeOne = new MonsterType("Vampire");
		MonsterType typeTwo = new MonsterType("Werewolf");
		
		MonsterProfile profileOne = new MonsterProfile(203, "Vlad", "bloodyHeck1816", "password", typeOne);
		
		monsterTypeRepo.save(typeOne);
		monsterTypeRepo.save(typeTwo);
		monsterProfileRepo.save(profileOne);
	}
	
}
