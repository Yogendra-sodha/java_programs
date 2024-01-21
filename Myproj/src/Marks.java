import java.util.Scanner;
public class Marks {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = s.next();
		int roll = s.nextInt();
		int m1 = s.nextInt();
		int m2 = s.nextInt();
		float avg = (m1+m2)/2 ;
		int tot = m1+m2;
		System.out.println(avg+" "+tot);
		System.out.println(roll+name);
		
	}
}