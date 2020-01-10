package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import Random.MinimumValueBT.Node;

public class BSTZigZag {
	
	static TreeNode head;
	
	public class TreeNode {
	     int val;
	     TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
    }
	

	
	public TreeNode insert(TreeNode node, int data) {
		
		if(node == null) {
			return new TreeNode(data);
		} else {
			
			if(data < node.val) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		
		return node;
	}
	
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        
        if(root == null){
            return result;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        boolean order=true;
        
        while(!queue.isEmpty()){
            
            int size = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            
            for(int i=0; i<size; i++){

                TreeNode current = queue.remove();
                
                if(order) {
                    currentLevel.add(current.val);
                } else {
                    currentLevel.add(0, current.val);
                }
                
                if(current.left != null){
                    queue.add(current.left);
                }

                if(current.right != null){
                    queue.add(current.right);
                }
            }
            
            result.add(currentLevel);
            order = order? false:true;
        }
        
        return result;
    }
	 
	 public static void main(String[] args) {
		 
		 BSTZigZag node = new BSTZigZag(); 
		 node.insert(head, 3);
		 node.insert(head, 9);
		 node.insert(head, 20);
		 node.insert(head, 15);
		 node.insert(head, 17);
		 
		 List<List<Integer>> zig = node.zigzagLevelOrder(head);
		 
		 System.out.println("zig"+ zig);
		 
		 for(List<Integer> z:zig) {
			 for(Integer xData :z) {
				 System.out.println("xData"+ xData);
			 }
		 }
	 }
}
