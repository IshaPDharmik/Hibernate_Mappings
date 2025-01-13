package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Peoples {

	@Id
	private int p_id;
	private String p_name;
	@ManyToOne
	@JoinColumn(name = "home_peoples")
	private Home home;

	public Peoples() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Peoples(int p_id, String p_name, Home home) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.home = home;
	}

	public int getP_id() {
		return p_id;
	}

	public void setP_id(int p_id) {
		this.p_id = p_id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}

	@Override
	public String toString() {
		return "Peoples [p_id=" + p_id + ", p_name=" + p_name + ", home=" + home + "]";
	}

}
