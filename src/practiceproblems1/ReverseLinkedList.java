package practiceproblems1;

public class ReverseLinkedList {
	
	public class Node{
		int val;
		Node next;
		
		public Node(){
			
		}
		
		public Node(int val) {
			this.val = val;
		}
		
		
	}
	
	public Node reverseList(Node head) {
		Node newhead = null;
		while(head != null) {
			Node nodenext = head.next;
			head.next = newhead;
			newhead = head;
			head = nodenext;
		}
		return newhead;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
