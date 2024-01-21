import java.util.Scanner;
public class Retail {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("name");
		String iName = s.next();
		System.out.println("rate");
		double rate = s.nextInt();
		System.out.println("quantity");
		int qty = s.nextInt();
		double price = rate * qty;
		
		if (price >= 1000 && price <2000)
			System.out.println(iName+rate+qty+" "+(price - (price * 0.10)));
		if (price >= 2000 && price < 3000)
			System.out.println(iName+rate+qty+" "+(price - (price * 0.20)));
		else
			System.out.println(iName+rate+" "+qty+" "+(price - (price * 0.30)));

	}

}
