package java8;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class JavaStreams {
	
		public static void main(String[] args) {
			
//			1. IntegerStream
			
//			IntStream
//				.range(1, 10)
//				.forEach(System.out::println);
			
			double total = Stream.of(7.3, 1.5, 4.8).reduce(1.0, (Double a, Double b) -> a + b);
			System.out.println(total);
			
			IntStream
				.range(1, 10)
				.skip(5)
				.forEach(System.out::println);
			
			
		}
}
