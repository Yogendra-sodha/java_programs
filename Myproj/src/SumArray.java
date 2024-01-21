import java.util.Scanner;
public class SumArray {
	public static void main(String[] args) {
//		find sum of array
		Scanner s = new Scanner(System.in);
		int size = s.nextInt();
		int [] num = new int[size];
		int res = 0;
		for (int i=0;i<num.length;i++) {
			System.out.println("Enter input");
			num[i]= s.nextInt();
			System.out.println(num);
			res+=num[i];
		}
		System.out.println("Sum of array "+num+" "+res);
		
		for (int i=0;i<num.length;i++) {
			System.out.println(num[i]);
		}
		
	}

}
