package io.github.vinopaldimit.monstermatch.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

abstract class Undead extends Profile {

	@Id
	@GeneratedValue
	private Long id;

	private String dateOfDeath;
	private String causeOfDeath;

	public Undead() {
	}

	public Undead(String name, String age, String userName, String password, String dateOfBirth, CreatureType type,
			String dateOfDeath, String causeOfDeath) {
		super(name, age, userName, password, dateOfBirth, type);
		this.dateOfDeath = dateOfDeath;
		this.causeOfDeath = causeOfDeath;
	}

	// GETTERS

	public Long getId() {
		return id;
	}

	public String getDateOfDeath() {
		return dateOfDeath;
	}

	public String getCauseOfDeath() {
		return causeOfDeath;
	}

	// SETTERS

	public void setDateOfDeath(String dateOfDeath) {
		this.dateOfDeath = dateOfDeath;
	}

	public void setCauseOfDeath(String causeOfDeath) {
		this.causeOfDeath = causeOfDeath;
	}

}
