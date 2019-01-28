package io.github.vinopaldimit.monstermatch.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class MonsterType {

	@Id
	@GeneratedValue
	private Long id;

	private String officialName;
	//private Collection<String> aliases;

	@JsonIgnore
	@OneToMany(mappedBy = "type")
	private Collection<MonsterProfile> profiles;

	@JsonIgnore
	@ManyToMany
	private Collection<MonsterProfile> seekers;
	
	public MonsterType() {}

	public MonsterType(String officialName) {
		this.officialName = officialName;
	}

	public Long getId() {
		return id;
	}

	public String getOfficialName() {
		return officialName;
	}

//	public Collection<String> getAliases() {
//		return aliases;
//	}

	public Collection<MonsterProfile> getProfiles() {
		return profiles;
	}

	public Collection<MonsterProfile> getSeekers() {
		return seekers;
	}
}
