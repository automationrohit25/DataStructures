package practiceproblems1;

public class StackImplementationUsingArray {
	
	int size;
	int arr[];
	int top;
	
	public StackImplementationUsingArray(int size) {
		this.size = size;
		this.arr = new int[size];
		this.top = -1;
		
	}
	
	public void push(int element) {
		if(!isFull()) {
			top++;
			arr[top] = element;
			System.out.println("pushed element" + element);
		} else {
			System.out.println("stack is full");
		}
	}
	
	public int pop() {
		if(!isEmpty()) {
			int returnedtop = top;
			top--;
			System.out.println("popped element" + arr[returnedtop]);
			return arr[returnedtop];
		} else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public int isPeek() {
		if(!isEmpty()) {
			return arr[top];
		} else {
			System.out.println("stack is empty");
			return -1;
		}
	}
	
	public boolean isEmpty() {
		return (top == -1);
		
	}
	
	public boolean isFull() {
		return (size-1 == top);
	}

	public static void main(String[] args) {
		
		StackImplementationUsingArray siua = new StackImplementationUsingArray(10);
		siua.pop();
		siua.push(10);
		siua.push(20);
		siua.pop();
		
		

	}

}
