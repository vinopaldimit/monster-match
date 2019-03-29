package io.github.vinopaldimit.monstermatch.models.categories;

import io.github.vinopaldimit.monstermatch.models.Profile;

abstract class Undead extends Profile {

	private String dateOfDeath;
	private String causeOfDeath;

	public Undead() {
	}

	public Undead(String name, String age, String userName, String password, String dateOfBirth,
			String dateOfDeath, String causeOfDeath) {
		super(name, age, userName, password, dateOfBirth);
		this.dateOfDeath = dateOfDeath;
		this.causeOfDeath = causeOfDeath;
	}

	// GETTERS

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
