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
	@Column(name="clientid")					
	private int clientId;
	@Column(name="cartid")					
	private int cartId;
	@Column(name="driverid")					
	private int driverId;						
	@Column(name="cabid")					
	private int cabId;

	
	//default constructor
	public Resv() {
		super();
	}

	
	//parameterized constructor



	//getter and setter methods



	//override to-string method


}
