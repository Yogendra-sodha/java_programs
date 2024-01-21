package stringfunction;

public class Pallindrome {
	
	boolean paliCheck() {
		String a = "pelcmep";
		int start = 0;
		int end = a.length()-1;
		while(end>start) {
			if (a.charAt(start) != a.charAt(end)){
				return false;
			}
			start++;
			end--;

		}
		return true;
	}

	public static void main(String[] args) {
		Pallindrome test = new Pallindrome();
		if (test.paliCheck()) {
			System.out.println("Pallindrome "+test.paliCheck());
		}
		else {
		System.out.println("Not Pallindrome "+test.paliCheck());}

	}

}
