package lambda_stream;
import java.util.*;
import java.util.stream.*;

class Mobile{
	int id;
	String name;
	int price;

	Mobile(int id, String name,int price){
		this.id = id;
		this.name = name;
		this.price = price;
	}
	Mobile(){};
	public String toString() {
		return id+" "+name+" "+price;
	}
}

public class StreamFilter {
	public static void main(String[] args) {
		List<Mobile> abl = getProd().stream().filter((pr) ->pr.price > 100 ).collect(Collectors.toList());
		System.out.println(abl);
	}
	
	private static List<Mobile> getProd(){
		List<Mobile> ml = new ArrayList<Mobile>();
		ml.add(new Mobile(1,"abc",200));
		ml.add(new Mobile(2,"bfa",100));
		ml.add(new Mobile(3,"ewan",6512));
		return ml;
	}
}
