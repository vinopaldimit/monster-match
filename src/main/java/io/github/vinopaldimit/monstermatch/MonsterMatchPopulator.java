package io.github.vinopaldimit.monstermatch;

import javax.annotation.Resource;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import io.github.vinopaldimit.monstermatch.models.Profile;
import io.github.vinopaldimit.monstermatch.repositories.ProfileRepo;

@Service
public class MonsterMatchPopulator implements CommandLineRunner {

	@Resource
	ProfileRepo profileRepo;

	@Override
	public void run(String... args) throws Exception {
		
		//TODO update this
		Profile profileOne = new Profile("Vlad", "12000", "bloodMan69", "oneAhAhAh", "Unknown");
		profileRepo.save(profileOne);
	}

}
