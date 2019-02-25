package com.alighthub.bikeRent.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Location 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int location_id;
	private String location_name;
	
	@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name="b_id")
	private List<Bike> bike;
	
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getLocation_name() {
		return location_name;
	}
	public void setLocation_name(String location_name) {
		this.location_name = location_name;
	}
	public List<Bike> getBike() {
		return bike;
	}
	public void setBike(List<Bike> bike) {
		this.bike = bike;
	}
	
}
