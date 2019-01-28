package io.github.vinopaldimit.monstermatch.models;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class MonsterProfile {

	@Id
	@GeneratedValue
	private Long id;

	private int age;
	private String name;
	private String userName;
	private String password;

	@ManyToOne
	private MonsterType type;

	@ManyToMany
	private Collection<MonsterType> seeking;
	
	public MonsterProfile() {}

	public MonsterProfile(int age, String name, String userName, String password, MonsterType type) {
		this.age = age;
		this.name = name;
		this.userName = userName;
		this.password = password;
		this.type = type;
	}

	public Long getId() {
		return id;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public String getUserName() {
		return userName;
	}

	public String getPassword() {
		return password;
	}

	public MonsterType getType() {
		return type;
	}

	public Collection<MonsterType> getSeeking() {
		return seeking;
	}

}
