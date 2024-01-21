package Inheritance;
// inheritance - base and inherited
// polymorphism - method overloading, method overriding

class Base {
	int i;
	int j;
	void inputEle (int i, int j) {
		this.i = i;
		this.j = j;
	}
	void display() {
		System.out.println(i);
		System.out.println(j);
	}
}

public class Inheritance extends Base {
	
	int k;
	void input (int k) {
		this.k = k;
	}
	void display () {
		super.display();
		System.out.println(k);
	}
	
	public static void main(String[] args) {
		Base b = new Base();
		b.inputEle(1, 2);
		b.display();
		Inheritance derived = new Inheritance();
		derived.inputEle(20,200);
		derived.display();
	}
}
