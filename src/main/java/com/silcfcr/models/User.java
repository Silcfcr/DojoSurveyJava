package com.silcfcr.models;

public class User {
//	click on attribute -> source -> generate getters and setters
	private String name;
	private String location;
	private String language;
	private String comment;
	
	public User( String name, String location, String language, String comment ) {
		this.name = name;
		this.location = location;
		this.language = language;
		this.comment = comment;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	
}
