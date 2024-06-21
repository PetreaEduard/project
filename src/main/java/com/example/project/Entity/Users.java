package com.example.project.Entity;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "users")  // Specifies the table name in the database
public class Users implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;  // Primary key field

	private String username;  // Username of the user
	private String password;  // Password of the user

	// Constructors
	public Users() {
	}

	public Users(String username, String password) {
		this.username = username;
		this.password = password;
	}

	// Getters and setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	// Optionally, you can override toString(), equals(), and hashCode() methods
}