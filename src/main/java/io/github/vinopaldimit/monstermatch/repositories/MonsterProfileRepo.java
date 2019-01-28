package io.github.vinopaldimit.monstermatch.repositories;

import org.springframework.data.repository.CrudRepository;

import io.github.vinopaldimit.monstermatch.models.MonsterProfile;

public interface MonsterProfileRepo extends CrudRepository<MonsterProfile, Long> {

}