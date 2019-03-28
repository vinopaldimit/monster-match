package io.github.vinopaldimit.monstermatch.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Human extends Profile {

	@Id
	@GeneratedValue
	private Long id;

	private boolean wantStayAlive;
	private boolean wantGetBitten;
	private boolean wantGetTurned;

	public Human() {
	}

	public Human(String name, String age, String userName, String password, String dateOfBirth, CreatureType type,
			boolean wantStayAlive, boolean wantGetBitten, boolean wantGetTurned) {
		super(name, age, userName, password, dateOfBirth, type);
		this.wantStayAlive = wantStayAlive;
		this.wantGetBitten = wantGetBitten;
		this.wantGetTurned = wantGetTurned;
	}

	// GETTERS

	public Long getId() {
		return id;
	}

	public boolean isWantStayAlive() {
		return wantStayAlive;
	}

	public boolean isWantGetBitten() {
		return wantGetBitten;
	}

	public boolean isWantGetTurned() {
		return wantGetTurned;
	}

	// SETTERS

	public void setWantStayAlive(boolean wantStayAlive) {
		this.wantStayAlive = wantStayAlive;
	}

	public void setWantGetBitten(boolean wantGetBitten) {
		this.wantGetBitten = wantGetBitten;
	}

	public void setWantGetTurned(boolean wantGetTurned) {
		this.wantGetTurned = wantGetTurned;
	}

}
