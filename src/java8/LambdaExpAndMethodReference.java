package java8;

import java.util.Arrays;
import java.util.List;

public class LambdaExpAndMethodReference {

	public static void main(String[] args) {
		
		List<String> nameList = Arrays.asList("Tom", "Peter", "Naveen", "Simon");
		
		nameList.forEach(str -> System.out.println(str));
		
		System.out.println("----------------------------");
		
		nameList.forEach(System.out::println);

	}

}
