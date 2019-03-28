package io.github.vinopaldimit.monstermatch.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class CreatureType {

	@Id
	@GeneratedValue
	private Long id;

	private String officialName;
	// private Collection<String> aliases;

	@JsonIgnore
	@OneToMany(mappedBy = "type")
	private Collection<Profile> profiles;

	@JsonIgnore
	@ManyToMany
	private Collection<Profile> seekers;

	public CreatureType() {
	}

	public CreatureType(String officialName) {
		this.officialName = officialName;
	}

	// GETTERS

	public Long getId() {
		return id;
	}

	public String getOfficialName() {
		return officialName;
	}

//	public Collection<String> getAliases() {
//		return aliases;
//	}

	public Collection<Profile> getProfiles() {
		return profiles;
	}

	public Collection<Profile> getSeekers() {
		return seekers;
	}
}
