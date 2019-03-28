package io.github.vinopaldimit.monstermatch.repositories;

import org.springframework.data.repository.CrudRepository;

import io.github.vinopaldimit.monstermatch.models.Profile;

public interface ProfileRepo extends CrudRepository<Profile, Long> {

}