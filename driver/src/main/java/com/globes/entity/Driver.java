package com.globes.entity;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Driver {
	//add fields
	@Id                          							//indicates the column below it is the primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)     //auto-generate the ID in sql
	private int driverid;
	private String email;
	private String password;
	private String fullname;
	private int logintype;
	private LocalDate addedon;
	
	
	//default constructor
	public Driver() {
		super();
	}

	
	//parameterized constructor
	public Driver(int driverid, String email, String password, String fullname, int logintype, LocalDate addedon) {
		super();
		this.driverid = driverid;
		this.email = email;
		this.password = password;
		this.fullname = fullname;
		this.logintype = logintype;
		this.addedon = addedon;
	}

	
	//getter and setter methods
	public int getDriverid() {
		return driverid;
	}

	public void setDriverid(int driverid) {
		this.driverid = driverid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public int getLogintype() {
		return logintype;
	}

	public void setLogintype(int logintype) {
		this.logintype = logintype;
	}

	public LocalDate getAddedon() {
		return addedon;
	}

	public void setAddedon(LocalDate addedon) {
		this.addedon = addedon;
	}


	//override to-string method
	@Override
	public String toString() {
		return "Driver [driverid=" + driverid + ", email=" + email + ", password=" + password + ", fullname=" + fullname
				+ ", logintype=" + logintype + ", addedon=" + addedon + "]";
	}
}
