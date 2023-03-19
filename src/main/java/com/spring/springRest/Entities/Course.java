package com.spring.springRest.Entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
@Id
	private int id;
	private String name;
	private String address;
	
	
	
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Course(int id, String name, String address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
	
}