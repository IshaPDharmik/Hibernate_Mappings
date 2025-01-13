package com.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Home {

	@Id
	private int h_id;
	private String h_name;
	@OneToMany(mappedBy = "home")
	private List<Peoples> people;

	public Home(int h_id, String h_name, List<Peoples> people) {
		super();
		this.h_id = h_id;
		this.h_name = h_name;
		this.people = people;
	}

	@Override
	public String toString() {
		return "Home [h_id=" + h_id + ", h_name=" + h_name + ", people=" + people + "]";
	}

	public Home() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getH_id() {
		return h_id;
	}

	public void setH_id(int h_id) {
		this.h_id = h_id;
	}

	public String getH_name() {
		return h_name;
	}

	public void setH_name(String h_name) {
		this.h_name = h_name;
	}

	public List<Peoples> getPeople() {
		return people;
	}

	public void setPeople(List<Peoples> people) {
		this.people = people;
	}

}