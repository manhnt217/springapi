package com.example.springapi.entity;

import javax.persistence.Entity;

/**
 * @author manhnt
 */

@Entity
public class User {

	private final String id;
	private final String firstName;
	private final String lastName;
	private final Title title;

	public User(String id, String firstName, String lastName, Title title) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Title getTitle() {
		return title;
	}
}
