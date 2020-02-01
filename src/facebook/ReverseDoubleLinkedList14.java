package facebook;

public class ReverseDoubleLinkedList14 {
	
	     class DoublyLinkedListNode {
	        int data;
	         DoublyLinkedListNode next;
	         DoublyLinkedListNode prev;
	      }
	     
	  static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
	         
	         if(head == null){
	             return head;
	         }
	         DoublyLinkedListNode tmp = null;
	         DoublyLinkedListNode curr = head;

	         while(curr != null){
	             tmp = curr.prev;
	             curr.prev = curr.next;
	             curr.next = tmp;
	             curr = curr.prev; 
	         }

	         if(tmp != null){
	             head = tmp.prev;
	         }

	         return head;

	     }    
	
	/*static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
	       
        if(head == null){
            return head;
        }
        DoublyLinkedListNode curr = head;
        DoublyLinkedListNode newCurr = head;

        while(curr != null){
            DoublyLinkedListNode prev = curr.prev;
            curr.prev = curr.next;
            curr.next = prev;
            newCurr = curr;
            curr = curr.prev; 
        }

        return newCurr;

    } */
    
}
