package stringfunction;

class VowelDemo {
	String demo = "This is a word";
	void counter() {
		demo = demo.replaceAll(" ", "").toLowerCase();
		System.out.println(demo);
		String vowel = "aeiou";
		int v = 0;
		int c = 0;
		for(int i = 0;i<demo.length();i++)
		{
			if (vowel.contains(String.valueOf(demo.charAt(i)))) {
				v++;}
			else {
				c++;}
				
		}
		System.out.println(v+" "+c);
	}
}

public class VowelCount {
	
	public static void main(String[] args) {
		VowelDemo demo = new VowelDemo();
		demo.counter();
		
	}

}