package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamFilterCollect {

	public static void main(String[] args) {
		
		List<String> productList = Arrays.asList("Tom", "Peter", "Naveen", "Simon");
		
		List<String> result = productList.stream().filter(ele ->! ele.equals("Simon")).collect(Collectors.toList());
		
		result.forEach(ele -> System.out.println(ele));
		result.forEach(System.out::println);
		
		

	}

}
