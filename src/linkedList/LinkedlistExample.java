package linkedList;

public class LinkedlistExample {
	
	Node head; // head of the list
	
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		
		LinkedlistExample lle = new LinkedlistExample();
		lle.head = new Node(1);
		Node second = new Node(2);
		Node third = new Node(3);
		
		lle.head.next = second;
		second.next = third;

	}

}
