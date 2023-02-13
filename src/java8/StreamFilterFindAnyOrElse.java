package java8;

import java.util.Arrays;
import java.util.List;

public class StreamFilterFindAnyOrElse {

	public static void main(String[] args) {
		
		List<Customer> customersList = Arrays.asList(
									new Customer("Tom",30),
									new Customer("Steve", 40),
									new Customer("Peter", 54),
									new Customer("Simon", 23));
		
		 Customer customer = customersList.stream().filter(x -> "Peter".equals(x.getName())).findAny().orElse(null);
		 
		 System.out.println();
		
							

	}

}
