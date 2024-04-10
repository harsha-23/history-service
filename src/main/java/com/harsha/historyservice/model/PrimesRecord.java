package com.harsha.historyservice.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class PrimesRecord {

	@Id
	@GeneratedValue
	private int id;
	
	private String customer;
	
	private int n;
	
	private boolean isPrime;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
}
