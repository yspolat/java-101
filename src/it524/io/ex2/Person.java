package it524.io.ex2;

import java.io.Serializable;

public class Person implements Serializable{
	

	private int id;
	private String name;
	private String lastname;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}
	
	public Person(int id, String name, String lastname) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
	}
	
	public void getRegistered() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
}
