package com.account.test;
import com.account.*;


public class BankTest{
	public static void main(String[] args) {
	Customer c = new Customer("Abc");
	System.out.println(c.getcName());
	Bank cust = new Bank(1,"Savings",200,c.getcName());
	cust.withdraw(20);
	cust.deposit(40);
	cust.dispDetails();
	}
}