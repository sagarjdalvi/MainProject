package com.alighthub.bikeRent.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Dealer {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int dealer_id;
	private String dealer_name;
	private int mobile_no;
	private String email;
	private long dealer_aadhar;
	private String dealer_address;
	private Date registration_date;
	private int bikes_lent;
	@OneToOne(cascade=CascadeType.MERGE)
	private Location location;
	@OneToMany(cascade=CascadeType.ALL)
	private List<Bike> bike;
	public int getDealer_id() {
		return dealer_id;
	}
	public void setDealer_id(int dealer_id) {
		this.dealer_id = dealer_id;
	}
	public String getDealer_name() {
		return dealer_name;
	}
	public void setDealer_name(String dealer_name) {
		this.dealer_name = dealer_name;
	}
	public int getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(int mobile_no) {
		this.mobile_no = mobile_no;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getDealer_aadhar() {
		return dealer_aadhar;
	}
	public void setDealer_aadhar(long dealer_aadhar) {
		this.dealer_aadhar = dealer_aadhar;
	}
	public String getDealer_address() {
		return dealer_address;
	}
	public void setDealer_address(String dealer_address) {
		this.dealer_address = dealer_address;
	}
	
	public int getBikes_lent() {
		return bikes_lent;
	}
	public void setBikes_lent(int bikes_lent) {
		this.bikes_lent = bikes_lent;
	}
	public Location getLocation() {
		return location;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Date getRegistration_date() {
		return registration_date;
	}
	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}
	public List<Bike> getBike() {
		return bike;
	}
	public void setBike(List<Bike> bike) {
		this.bike = bike;
	}
	
}
