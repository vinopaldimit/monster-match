package io.github.vinopaldimit.monstermatch.models.categories;

import io.github.vinopaldimit.monstermatch.models.Profile;

public class Human extends Profile {

	private boolean wantStayAlive;
	private boolean wantGetBitten;
	private boolean wantGetTurned;

	public Human() {
	}

	public Human(String name, String age, String userName, String password, String dateOfBirth,
			boolean wantStayAlive, boolean wantGetBitten, boolean wantGetTurned) {
		super(name, age, userName, password, dateOfBirth);
		this.wantStayAlive = wantStayAlive;
		this.wantGetBitten = wantGetBitten;
		this.wantGetTurned = wantGetTurned;
	}

	// GETTERS

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
