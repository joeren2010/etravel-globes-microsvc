package com.globes.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import javax.persistence.*;


@Entity
@Table(name="resv")
@NamedQuery(name="Resv.findAll", query="SELECT r FROM Resv r")
public class Resv implements Serializable{
	private static final long serialVersionUID = 1L;
	
	//add fields
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="resvid")					//tells springboot to map to cabid
	private int resvId;						//by default: springboot will map this to cab_id
	@Column(name="resvstatus")
	private String resvStatus;						
//	@Column(name="clientid")					
//	private int clientId;
	@Column(name="cartid")					
	private int cartId;
//	@Column(name="driverid")					
//	private int driverId;						
	@Column(name="cabid")					
	private int cabId;
	
	
	//default constructor
	public Resv() {
		super();
	}

	//parameterized constructor
	public Resv(int resvId, String resvStatus, int cabId, int cartId) {
		super();
		this.resvId = resvId;
		this.resvStatus = resvStatus;
		this.cabId = cabId;
		this.cartId = cartId;
	}

	//getter and setter methods
	public int getResvId() {
		return resvId;
	}

	public void setResvId(int resvId) {
		this.resvId = resvId;
	}

	public String getResvStatus() {
		return resvStatus;
	}

	public void setResvStatus(String resvStatus) {
		this.resvStatus = resvStatus;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	public int getCabId() {
		return cabId;
	}
	
	public void setCabId(int cabId) {
		this.cabId = cabId;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	//override to-string method
	@Override
	public String toString() {
		return "Resv [resvId=" + resvId + ", resvStatus=" + resvStatus + ", cabId=" + cabId + ", cartId=" + cartId + "]";
	}
	
}
