package com.te.hibernateonetomany;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Aunty {
	@Id
	private int gid;
	private String name;
	@OneToMany
	private List<Uncle> boys;

	public int getGid() {
		return gid;
	}

	public void setGid(int gid) {
		this.gid = gid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Uncle> getBoys() {
		return boys;
	}

	public void setBoys(List<Uncle> boys) {
		this.boys = boys;
	}

	@Override
	public String toString() {
		return "Girl [gid=" + gid + ", name=" + name + ", boys=" + boys + "]";
	}
	
	
		
	}

