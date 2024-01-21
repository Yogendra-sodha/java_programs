import java.util.Scanner;

public class PostiveCheck{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		if (a>=0)
			if (a==0)
				System.out.println("Zero");
			else
				System.out.println("It is positive");
		else
			System.out.println("Negative");
		
	}
	
}