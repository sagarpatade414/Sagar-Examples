package Random;

public class LengthOfLinkedList {
	
	private Node head;
	
	public static void main(String[] args) {
		LengthOfLinkedList ll = new LengthOfLinkedList();
		//ll.insertFirst(4);
		//ll.insertFirst(5);
		//ll.insertFirst(10);
		//ll.insertFirst(12);
		
		ll.insertLast(4);
		ll.insertLast(5);
		ll.insertLast(10);
		ll.insertLast(12);
		int count = ll.countLengthOfLinked();
		System.out.println("Count : " + count);
		boolean search = ll.searchInLinkedList(12);
		System.out.println("searchInLinkedList : " + search);
	}
	
	
	public void LengthOfLinkedList() {
		this.head=null;
	}
	
	
	public Node insertFirst(int data) {
		
		if(head == null) {
			head = new Node(data);
		} else {
			Node tmp = new Node(data);
			tmp.next = head;
			head= tmp;
		}
		
		return head;
	}
	
	
	public Node insertLast(int data) {
		
		if(head == null) {
			head = new Node(data);
		} else {
			Node node = head;
			while(node.next != null) {
				node = node.next;
			}
			
			node.next = new Node(data);
		}
		
		return head;
	}
	
	public int countLengthOfLinked() {
		int count=0;
		
		while(head != null){
			//System.out.println("head : " + head.data);
			head = head.next;
			count++;
		}
		
		return count;
		
	}
	
	
	public boolean searchInLinkedList(int value){
		Node node = head;
		boolean isFound = false;
		
		while(node != null) {
			System.out.println("node : " + node);
			if(node.data == value) {
				return true;
			} else {
				node = node.next;
			}	
		}
		
		return isFound;
	}
	
	public class Node {
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
		
	}
}
