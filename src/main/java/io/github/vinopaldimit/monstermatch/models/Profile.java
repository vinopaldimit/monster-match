package io.github.vinopaldimit.monstermatch.models;

import java.util.Collection;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

public class Profile {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String age;
	private String userName;
	private String password;
	private String dateOfBirth;

	@ManyToMany
	private Collection<CreatureType> seeking;

	@ManyToOne
	private CreatureType type;

	public Profile() {
	}

	// TODO figure out what to do about seeking collection

	public Profile(String name, String age, String userName, String password, String dateOfBirth, CreatureType type) {
		this.name = name;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
		this.type = type;
	}

	// GETTERS

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAge() {
		return age;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public Collection<CreatureType> getSeeking() {
		return seeking;
	}

	public CreatureType getType() {
		return type;
	}

	// SETTERS

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public void setSeeking(Collection<CreatureType> seeking) {
		this.seeking = seeking;
	}

	public void setType(CreatureType type) {
		this.type = type;
	}

}
