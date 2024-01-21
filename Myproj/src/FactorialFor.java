import java.util.Scanner;
public class FactorialFor {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numInp = s.nextInt();
		int res = fact(numInp);
		System.out.println("Fctorial for "+numInp+" is "+res);
	}
	
	static int fact(int n) {
		int f = 1;
		for(int i=n;i>=1;i--) {
			f = f*i;
		}
		return f;
	}
}