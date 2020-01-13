package Heaps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Set;

public class SortedKList {
	public class ListNode {
		int val;
		ListNode next;
		ListNode(int x) { val = x; }
	 }
	
	public ListNode mergeKLists(ListNode[] lists) {
		
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        
        for(ListNode head:lists){
          while(head != null){    
            minHeap.add(head.val);
            head = head.next;
          }  
        }
        
        ListNode result = new ListNode(-1);
        ListNode head = result;
        
        while(!minHeap.isEmpty()){
            head.next = new ListNode(minHeap.remove());
            head = head.next;
        }
        
        return result.next; 
        
    }
}
