import java.util.Scanner;
public class Switchcase {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int res=0;
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		System.out.println("1 - ADD");
		System.out.println("2 - Multiply");
		System.out.println("3 - Substract");
		System.out.println("4 - Divide");
		String operator = s.next();
		switch (operator) {
		case "1":
			res = n1+n2;
//			break;
		case "2":
			System.out.println(n1*n2);
//			break;10
		case "3":
			System.out.println(n1-n2);
//			break;
		default: System.out.println("Invalid Choice");System.exit(1);
		}
	System.out.println(res);
		
	}
}
