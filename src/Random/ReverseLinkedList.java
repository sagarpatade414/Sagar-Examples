package Random;

public class ReverseLinkedList {
	 public static void main(String[] args) {
		 
         Node head = null;

         ReverseLinkedList ll = new ReverseLinkedList();
         head = ll.insertAtHead(head, 5);
         head = ll.insertAtHead(head, 8);
         head = ll.insertAtHead(head, 9);
         head = ll.insertAtHead(head, 15);
           
         System.out.println(" Linked List ");
         ll.print(head);

         Node reverse = ll.reverseLinkedList(head);

         System.out.println(" Reverse Linked List ");
         ll.print(reverse);
     }
	 
	public Node insertAtHead(Node head, int data) {
		 
        if (head == null) {
            head = new Node(data);

        } else {

           // Create a new node
           Node temp = new Node(data);
           // New node points to head
           temp.next = head;
           // Head points to a new node
           head = temp;
         }

          return head;
    }
	
	
	public Node reverseLinkedList(Node head) {
		 
        Node previous = null;
        Node curr = head;
        Node temp = null;

        while (curr != null) {
           temp = curr.next;
           curr.next = previous;
           previous = curr;
           curr = temp;
        }

        return previous;
    }
	
	public void print(Node head) {
		 
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
         }

         System.out.print("null");
         System.out.println(" ");
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
