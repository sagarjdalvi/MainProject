package com.alighthub.bikeRent.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cart 
	{
		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		private int cart_id;
		private Date cart_date;
		@OneToOne(cascade=CascadeType.ALL)
		private Customer customer;
		@OneToOne(cascade=CascadeType.ALL)
		private Bikes_Rates bikes_Rates;
		public int getCart_id() {
			return cart_id;
		}
		public void setCart_id(int cart_id) {
			this.cart_id = cart_id;
		}
		public Date getCart_date() {
			return cart_date;
		}
		public void setCart_date(Date cart_date) {
			this.cart_date = cart_date;
		}
		public Customer getCustomer() {
			return customer;
		}
		public void setCustomer(Customer customer) {
			this.customer = customer;
		}
		public Bikes_Rates getBikes_Rates() {
			return bikes_Rates;
		}
		public void setBikes_Rates(Bikes_Rates bikes_Rates) {
			this.bikes_Rates = bikes_Rates;
		}
	}
