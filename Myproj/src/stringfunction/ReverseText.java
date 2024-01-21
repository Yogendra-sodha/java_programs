package stringfunction;
// abc is a == a si cba
class RDemo {
	String reverse() {
	String s = "abc this";
	String b="";
	for (int i = s.length()-1;i>=0;i--) {
		b+=s.charAt(i);
	}
	return b;
	}
}

public class ReverseText {
	
	public static void main(String[] args) {
		RDemo test = new RDemo();
		System.out.println(test.reverse());
	}
}