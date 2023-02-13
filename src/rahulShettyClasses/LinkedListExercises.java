package rahulShettyClasses;

public class LinkedListExercises {
	
	class Node{
		
		int val;
		Node next;
		
		public Node(int val) {
			this.val = val;
		}
	}
	
	static Node head = null;
	Node tail = null;
	
	public void addNodeAtEnd(int val) {
		Node newNode = new Node(val);
		
		if(head == null) {
			head = newNode;
			tail = newNode;
		} else {
			tail.next = newNode;
			newNode.next = null;
			tail = newNode;
		}
		
	}
	
	public void printLinkedList(Node headNode) {
		
		Node current = headNode;
		while(current!=null) {
			System.out.println(current.val);
			current = current.next;
		}	
	}

	public static void main(String[] args) {
		
		LinkedListExercises l = new LinkedListExercises();
		l.addNodeAtEnd(10);
		l.addNodeAtEnd(20);
		l.addNodeAtEnd(30);
		l.printLinkedList(head);
	}

}
