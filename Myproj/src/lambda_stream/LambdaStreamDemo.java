package lambda_stream;
import java.util.*;
import java.util.stream.*;

@FunctionalInterface
interface Product{
//	in functional interface only one method should be there
	void productDemo();
}
//Stream api

public class LambdaStreamDemo {

	public static void main(String[] args) {
		Product p = () -> {System.out.println("Calling");};
		p.productDemo();
		List<String> l1 = List.of("Apple","Mango","pear");
		System.out.println(l1);
		Stream<String> s = l1.stream();
		s.forEach(System.out::println);
	}
}
