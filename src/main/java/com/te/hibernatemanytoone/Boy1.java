package com.te.hibernatemanytoone;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Boy1 {
	@Id
	private int bid;
	
	private String name;
	
	private double balance;
	
	@ManyToOne
	private Girl1 girls;

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
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

	public Girl1 getGirl1() {
		return girls;
	}

	public void setGirl1(Girl1 girl1) {
		this.girls = girl1;
	}

	@Override
	public String toString() {
		return "Boy1 [bid=" + bid + ", name=" + name + ", balance=" + balance + ", girl1=" + girls + "]";
	}
	
	
	
}
