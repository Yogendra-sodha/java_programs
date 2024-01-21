import java.util.Scanner;
public class NumCheck {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Print first number");
		int a = s.nextInt();
		
		if (a%2 == 0)
			System.out.println("It is even");
		if (a==2)
			System.out.println("It is 2");
		else
			System.out.println("It is odd");
			
	}

}
