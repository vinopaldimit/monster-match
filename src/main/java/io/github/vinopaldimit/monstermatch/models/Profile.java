package io.github.vinopaldimit.monstermatch.models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class Profile {

	@Id
	@GeneratedValue
	private Long id;

	private String name;
	private String age;
	private String userName;
	private String password;
	private String dateOfBirth;

	//TODO seeking

	//TODO specific type

	public Profile() {
	}

	// TODO figure out what to do about seeking collection

	public Profile(String name, String age, String userName, String password, String dateOfBirth) {
		this.name = name;
		this.age = age;
		this.userName = userName;
		this.password = password;
		this.dateOfBirth = dateOfBirth;
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

}
