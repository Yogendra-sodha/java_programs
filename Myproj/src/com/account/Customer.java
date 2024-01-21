package com.account;

public class Customer {
	int cId;
	private String cName;
	public Customer (String cName){
		this.setcName(cName);
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
}
