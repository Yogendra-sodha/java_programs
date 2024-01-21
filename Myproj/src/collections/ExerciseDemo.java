package collections;
import java.util.*;

class LinkedOps {
	
	LinkedList<Integer> ll = new LinkedList<Integer>();
	
	void addll (Integer s) {
		ll.add(s);
	}
	void removell (Integer s) {
		ll.remove(s);
	}
	void display() {
		System.out.println(ll);
	}
	
}

public class ExerciseDemo {
	public static void main(String[] args) {
		int sn;
		LinkedOps lo = new LinkedOps();
		do {
			System.out.println("1 -add");
			System.out.println("2 - remove");
			System.out.println("3 - disp");
			Scanner n = new Scanner(System.in);
			int num = n.nextInt();
			sn = num;
			if (num == 1) {
				Scanner inp = new Scanner(System.in);
				int ninp = inp.nextInt();
				lo.addll(ninp);
			}
			else if (num == 2){
				Scanner inp = new Scanner(System.in);
				int ninp = inp.nextInt();
				lo.removell(ninp);
			}
			else if (num == 3){
				lo.display();
			}
		}
		while(sn!=10);
	}
}
