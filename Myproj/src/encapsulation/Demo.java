package encapsulation;

class DemoMap {
	private int age;
	void setAge(int age) {
		this.age = age;
	}
	void display () {
		System.out.println("Age is "+ age);
	}

}

public class Demo {
	public static void main (String[] args) {
		DemoMap d = new DemoMap();
//			d.age = -20 saves from this as private does not allow modification outside class - security + abstraction = encapsulation
			d.setAge(20);
			d.display();
		}
	}