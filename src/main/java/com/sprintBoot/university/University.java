package com.sprintBoot.university;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class University implements Comparable<University>{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String address;
	
	public University() {
		
	}
	
	public University(Integer id) {
		this.id = id;
	}

	public University(String name, String address) {
		super();
		this.name = name;
		this.address = address;
	}
	
	public Integer getId() {
		return this.id;
	}
	public void setId(Integer id) {
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
	 public int compareTo(University o) {
	     return this.getName().compareTo(o.getName());
	 }

}
