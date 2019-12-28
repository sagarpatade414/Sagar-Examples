package linkedList;

public class RemoveDuplicatesInList {
	
	public class ListNode{
		int data;
		ListNode next;
		
		public ListNode(int data){
			this.data = data;
			this.next = null;
		}
		
	}
	
	public static void main(String[] args) {
		
	}
	
	 public ListNode deleteDuplicates(ListNode head) {
	     
		 if(head == null || head.next == null) {
			 return head;
		 }
		 
		 ListNode curr = head;
		 
		 while(curr.next != null) {
			 if(curr.data == curr.next.data) {
				 curr.next = curr.next.next;
			 } else {
				 curr = curr.next; 
			 }
		 }
		 
		 return head;
	 }
}
