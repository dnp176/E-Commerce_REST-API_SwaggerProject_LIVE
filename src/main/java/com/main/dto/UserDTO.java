package com.main.dto;

public class UserDTO {
    private int id;
    private String username;
    private String email;
    private int role;

    // Constructor
    public UserDTO(int id, String username, String email, int role) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.role = role;
    }

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getRole() {
		return role;
	}

	public void setRole(int role) {
		this.role = role;
	}
    
}
