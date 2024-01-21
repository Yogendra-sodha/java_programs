package collections;
import java.util.*;

public class MapDemo {
	public static void main(String[] args) {
		TreeMap<String, Integer> tm = new TreeMap<String, Integer>();
		tm.put("abc", 21);
		tm.put("cdf", null);
		tm.put("ref", 313);
		System.out.println(tm);
//		Base class variablename = keyword, subclass();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("abc", 21);
		hm.put("cdf", null);
		hm.put("ref", 313);
		System.out.println(hm);
//		iterating over map
		Set<String> s =  hm.keySet();
		for (String i : s) {
			System.out.println(hm.get(i));
		}
	}
}
