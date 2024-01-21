class Bank{
	int acNo;
	String acType;
	String acName;
	int acB;
	
	Bank(int acNo,String acType, int acB,String acName){
		this.acNo = acNo;
		this.acType = acType;
		this.acB = acB;
		this.acName = acName;
	}
	
	void withdraw(int amt){
		this.acB -= amt;
	}
	void deposit(int amt){
		this.acB += amt;
	}
	void dispDetails() {
		System.out.println("No = "+acNo);
		System.out.println("acType = "+acType);
		System.out.println("acB = "+acB);
		System.out.println("Name = "+acName);
	}
}

class Customer {
	int cId;
	String cName;
	Customer (String cName){
		this.cName = cName;
	}
}
public class BankTest{
	public static void main(String[] args) {
	Customer c = new Customer("Abc");
	System.out.println(c.cName);
	Bank cust = new Bank(1,"Savings",200,c.cName);
	cust.withdraw(20);
	cust.deposit(40);
	cust.dispDetails();
	}
}