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
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="resvdate")						
	private Date resvDate;						
	@Column(name="clientname")	
	private String clientName;
	@Column(name="clientid")					
	private int clientId;						
	@Column(name="clientemail")
	private String clientEmail;
	@Column(name="clientphone")	
	private String clientPhone;
	@Column(name="pickuploc")	
	private String pickupLoc;
	@Column(name="pickupdate")	
	private LocalDate pickupDate;
	@Column(name="pickuptime")	
	private LocalTime pickupTime;
	@Column(name="dropoffloc")	
	private String dropoffLoc;
	@Column(name="dropoffdate")	
	private LocalDate dropoffDate;
	@Column(name="dropofftime")	
	private LocalTime dropoffTime;
	@Column(name="tripdistance")					
	private int tripDistance;
	@Column(name="unitprice")
	private int unitPrice;
	@Column(name="totalamount")
	private int totalAmount;
	@Column(name="drivername")	
	private String driverName;
	@Column(name="driverid")					
	private int driverId;						
	@Column(name="cabid")					
	private int cabId;
	@Column(name="resvstatus")
	private String resvStatus;

	
	//default constructor
	public Resv() {
		super();
	}

	
	//parameterized constructor
	public Resv(int resvId, Date resvDate, String clientName, int clientId, String clientEmail, String clientPhone,
			String pickupLoc, LocalDate pickupDate, LocalTime pickupTime, String dropoffLoc, LocalDate dropoffDate,
			LocalTime dropoffTime, int tripDistance, int unitPrice, int totalAmount, String driverName, int driverId,
			int cabId, String resvStatus) {
		super();
		this.resvId = resvId;
		this.resvDate = resvDate;
		this.clientName = clientName;
		this.clientId = clientId;
		this.clientEmail = clientEmail;
		this.clientPhone = clientPhone;
		this.pickupLoc = pickupLoc;
		this.pickupDate = pickupDate;
		this.pickupTime = pickupTime;
		this.dropoffLoc = dropoffLoc;
		this.dropoffDate = dropoffDate;
		this.dropoffTime = dropoffTime;
		this.tripDistance = tripDistance;
		this.unitPrice = unitPrice;
		this.totalAmount = totalAmount;
		this.driverName = driverName;
		this.driverId = driverId;
		this.cabId = cabId;
		this.resvStatus = resvStatus;
	}


	//getter and setter methods
	public int getResvId() {
		return resvId;
	}


	public void setResvId(int resvId) {
		this.resvId = resvId;
	}


	public Date getResvDate() {
		return resvDate;
	}


	public void setResvDate(Date resvDate) {
		this.resvDate = resvDate;
	}


	public String getClientName() {
		return clientName;
	}


	public void setClientName(String clientName) {
		this.clientName = clientName;
	}


	public int getClientId() {
		return clientId;
	}


	public void setClientId(int clientId) {
		this.clientId = clientId;
	}


	public String getClientEmail() {
		return clientEmail;
	}


	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}


	public String getClientPhone() {
		return clientPhone;
	}


	public void setClientPhone(String clientPhone) {
		this.clientPhone = clientPhone;
	}


	public String getPickupLoc() {
		return pickupLoc;
	}


	public void setPickupLoc(String pickupLoc) {
		this.pickupLoc = pickupLoc;
	}


	public LocalDate getPickupDate() {
		return pickupDate;
	}


	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}


	public LocalTime getPickupTime() {
		return pickupTime;
	}


	public void setPickupTime(LocalTime pickupTime) {
		this.pickupTime = pickupTime;
	}


	public String getDropoffLoc() {
		return dropoffLoc;
	}


	public void setDropoffLoc(String dropoffLoc) {
		this.dropoffLoc = dropoffLoc;
	}


	public LocalDate getDropoffDate() {
		return dropoffDate;
	}


	public void setDropoffDate(LocalDate dropoffDate) {
		this.dropoffDate = dropoffDate;
	}


	public LocalTime getDropoffTime() {
		return dropoffTime;
	}


	public void setDropoffTime(LocalTime dropoffTime) {
		this.dropoffTime = dropoffTime;
	}


	public int getTripDistance() {
		return tripDistance;
	}


	public void setTripDistance(int tripDistance) {
		this.tripDistance = tripDistance;
	}


	public int getUnitPrice() {
		return unitPrice;
	}


	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}


	public int getTotalAmount() {
		return totalAmount;
	}


	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}


	public String getDriverName() {
		return driverName;
	}


	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}


	public int getDriverId() {
		return driverId;
	}


	public void setDriverId(int driverId) {
		this.driverId = driverId;
	}


	public int getCabId() {
		return cabId;
	}


	public void setCabId(int cabId) {
		this.cabId = cabId;
	}


	public String getResvStatus() {
		return resvStatus;
	}


	public void setResvStatus(String resvStatus) {
		this.resvStatus = resvStatus;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}


	//override to-string method
	@Override
	public String toString() {
		return "Resv [resvId=" + resvId + ", resvDate=" + resvDate + ", clientName=" + clientName + ", clientId="
				+ clientId + ", clientEmail=" + clientEmail + ", clientPhone=" + clientPhone + ", pickupLoc="
				+ pickupLoc + ", pickupDate=" + pickupDate + ", pickupTime=" + pickupTime + ", dropoffLoc=" + dropoffLoc
				+ ", dropoffDate=" + dropoffDate + ", dropoffTime=" + dropoffTime + ", tripDistance=" + tripDistance
				+ ", unitPrice=" + unitPrice + ", totalAmount=" + totalAmount + ", driverName=" + driverName
				+ ", driverId=" + driverId + ", cabId=" + cabId + ", resvStatus=" + resvStatus + "]";
	}

}