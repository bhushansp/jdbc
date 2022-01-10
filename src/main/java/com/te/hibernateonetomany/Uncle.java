package com.te.hibernateonetomany;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Uncle {
	@Id
	private int bid;
	private String name;
	private double balance;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Boy [bid=" + bid + ", name=" + name + ", balance=" + balance + "]";
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

}
