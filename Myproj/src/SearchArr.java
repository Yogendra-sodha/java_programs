// big, second, small, second small
public class SearchArr {
	public static void main(String[] args) {
		int [] num = {1,3,4,5,6,8};
		int big = num[0];
		int small = num[0];
		for (int i=0;i<num.length;i++) {
			if (num[i]>big) {
				big = num[i];
			}
			if (num[i]<small) {
				small = num[i];
			}
		}
		System.out.println(big+" "+small);
	}
}