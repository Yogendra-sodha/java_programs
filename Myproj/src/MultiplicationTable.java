import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
//		5 * 1 = 5
		int num = s.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}
