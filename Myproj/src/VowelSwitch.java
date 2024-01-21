import java.util.Scanner;
public class VowelSwitch {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String vowel = s.next();
		switch (vowel) {
		case "a":System.out.println("It is vowel");break;
		case "e":System.out.println("It is vowel");break;
		case "i":System.out.println("It is vowel");break;
		case "o":System.out.println("It is vowel");break;
		case "u":System.out.println("It is vowel");break;
		default : System.out.println("Not vowel");System.exit(0);
		}
	}

}
