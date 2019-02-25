package com.alighthub.bikeRent.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int employee_id;
	
	private String employee_name;
	
	private String employee_type;
	
	private String employee_email;
	
	private long employee_contact;
	
	private String employee_address;
	@ManyToOne(cascade=CascadeType.MERGE)
	private Location location;

	public int getEmployee_id() {
		return employee_id;
	}

	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}

	public String getEmloyee_name() {
		return employee_name;
	}

	public void setEmloyee_name(String employee_name) {
		this.employee_name = employee_name;
	}

	public String getEmployee_type() {
		return employee_type;
	}

	public void setEmployee_type(String employee_type) {
		this.employee_type = employee_type;
	}

	public String getEmployee_email() {
		return employee_email;
	}

	public void setEmployee_email(String employee_email) {
		this.employee_email = employee_email;
	}

	public long getEmployee_contact() {
		return employee_contact;
	}

	public void setEmployee_contact(long employee_contact) {
		this.employee_contact = employee_contact;
	}

	public String getEmployee_address() {
		return employee_address;
	}

	public void setEmployee_address(String employee_address) {
		this.employee_address = employee_address;
	}
	

}
