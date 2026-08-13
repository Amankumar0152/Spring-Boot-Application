package com.cloud.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bug 
{
	@Id
	private int aid;
	private String aname;
	
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	@Override
	public String toString() {
		return "Bug [aid=" + aid + ", aname=" + aname + "]";
	}
	
	
}
