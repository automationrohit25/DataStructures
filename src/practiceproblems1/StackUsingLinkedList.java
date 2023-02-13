package practiceproblems1;

public class StackUsingLinkedList {
	
	Node head;
	
	private class Node{
		int value; // integer data
		Node next; // Node type reference variable
	}
	
		
	public StackUsingLinkedList() {
		this.head = null;
	}

	//push : add value to the beginning
	public void push(int value) {
		
		Node extraNode = head;
		head = new Node();
		head.value = value;
		head.next = extraNode;
	}
	
	public int pop() {
		if(head == null) {
			System.out.println("Stack is empty");
		} 
			
		int value = head.value;
		head = head.next;
		return value;
	}
	
	
	public static void main(String[] args) {
		
		StackUsingLinkedList sll = new StackUsingLinkedList();
		sll.pop();
//		sll.push(10);
//		sll.push(20);
//		System.out.println(sll.pop());
	}

}
