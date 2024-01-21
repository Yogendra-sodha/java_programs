package com.account;

public class Bank{
	int acNo;
	String acType;
	String acName;
	int acB;
	
	public Bank(int acNo,String acType, int acB,String acName){
		this.acNo = acNo;
		this.acType = acType;
		this.acB = acB;
		this.acName = acName;
	}
	
	public void withdraw(int amt){
		this.acB -= amt;
	}
	public void deposit(int amt){
		this.acB += amt;
	}
	public void dispDetails() {
		System.out.println("No = "+acNo);
		System.out.println("acType = "+acType);
		System.out.println("acB = "+acB);
		System.out.println("Name = "+acName);
	}
}