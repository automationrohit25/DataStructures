package java8;

public class LambdaDeclaration {

	public static void main(String[] args) {
		
		WebPage w1 = (value, age) ->System.out.println("hi " + value + "age -->" + age);
//		WebPage w3 = (n) ->System.out.println(n.length());
		
		w1.header("google", 20);
//		w1.header("rohit");
		
		System.out.println(0.1 + 0.2);
	}

}
