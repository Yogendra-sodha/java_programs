package exception;

class WError extends Exception {
	WError (String msg){
		super(msg);
	}
	WError(){}
}

class Account {
	void withMoney(int uamt) throws WError {
		int amt = uamt;
		int credit = 200;
		if (credit>amt) {
			throw new WError("Insufficient Balance");
		}
		else {
			System.out.println("Money remain :" +(amt-credit));
		}
	}
}


public class Withdraw {
	public static void main(String[] args) {
		Account acc = new Account();
		try {
		acc.withMoney(300);
		}
		catch(WError e) {
			System.err.println(e);
		}
	}

}
