package collections;
import java.util.*;

// list, linked list, generic, ordered, unordered

public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		arr.add(2);
		arr.add(220);
		System.out.println(arr);
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(12);
		arrInt.addAll(arr);
		System.out.println(arrInt);
		arr.addAll(arrInt);
		System.out.println(arr);
		arrInt.addAll(arr);
		arrInt.remove(1);
		System.out.println(arrInt);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		ll.add(29);
		ll.addAll(arrInt);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		LinkedHashSet lhs = new LinkedHashSet();
		lhs.addAll(arrInt);
		System.out.println(lhs);
		TreeSet<Integer> ts = new TreeSet<Integer>();
		ts.addAll(arrInt);
		System.out.println(ts);
		HashSet hs = new HashSet();
		hs.addAll(arrInt);
		System.out.println(hs);
		
	}

}
