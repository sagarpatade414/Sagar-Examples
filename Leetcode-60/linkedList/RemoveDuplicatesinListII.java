package linkedList;

import linkedList.RemoveDuplicatesInList.ListNode;

public class RemoveDuplicatesinListII {
	
	public class ListNode{
		int val;
		ListNode next;
		
		public ListNode(int data){
			this.val = data;
			this.next = null;
		}
		
	}
	
	public ListNode deleteDuplicates(ListNode head) {
	    if (head == null) return null;
	    
	    if (head.next != null && head.val == head.next.val) {
	        while (head.next != null && head.val == head.next.val) {
	            head = head.next;
	        }
	        return deleteDuplicates(head.next);
	    } else {
	        head.next = deleteDuplicates(head.next);
	    }
	    return head;
	}
}
