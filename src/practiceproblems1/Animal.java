package practiceproblems1;

class Dog{
	 public void eat() {
		System.out.println("eat all veg");
	}
}

class Animal extends Dog{
	public void eat(){
		System.out.println("eat all meat");
	
	}
	public static void main(String[] args) {
		
		Dog d = new Animal();
		d.eat();
		
		Dog a = new Animal();
		a.eat();
		
		
		
		
	}

}


