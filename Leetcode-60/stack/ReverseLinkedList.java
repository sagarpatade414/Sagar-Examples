package stack;

import Random.LengthOfLinkedList.Node;

public class ReverseLinkedList {
	private ListNode head;
	
	public class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int data){
			this.val = data;
			this.next = null;
		}
		
	}
	
	public void ReverseLinkedList() {
		this.head=null;
	}
	
	public static void main(String[] args) {
		ReverseLinkedList li = new ReverseLinkedList();
		
		li.insertLast(1);
		li.insertLast(2);
		li.insertLast(3);
		li.insertLast(4);
		li.insertLast(5);
		//int count = ll.countLengthOfLinked();
		
		ListNode rev = reverseList(li.head);
		
		System.out.println("rev : " + rev.val);
		
	}
	
	public ListNode insertLast(int data) {
		
		if(head == null) {
			head = new ListNode(data);
		} else {
			ListNode node = head;
			while(node.next != null) {
				node = node.next;
			}
			
			node.next = new ListNode(data);
		}
		
		return head;
	}

	public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
           ListNode p = reverseList(head.next);
           head.next.next = head;
           head.next = null;
           return p;
   }
}
