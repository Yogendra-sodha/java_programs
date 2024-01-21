
public class EvenOdd {
	public static void main(String[] args) {
		int sumEven = 0;
		int sumOdd = 0;
		int cnt = 0;
		
		while (cnt<=10) {
			if (cnt%2 == 0)
				sumEven +=cnt;
			else
				sumOdd +=cnt;
			System.out.println(cnt);
			cnt++;
		}
		System.out.println("Sum of even is "+sumEven);
		System.out.println("Sum of odd is "+sumOdd);
	}

}
