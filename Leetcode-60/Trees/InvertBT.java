package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class InvertBT {
	
	public class TreeNode {
	     int val;
	     TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
   }
	
	public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return root;
        }
        
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        
        root.left = right;
        root.right = left;
        
        return root;
    }
	
	public TreeNode invertTree2(TreeNode root) {
        if(root==null){
            return root;
        }
        
        Queue<TreeNode> que = new LinkedList<>();
        que.offer(root);
        
        while(!que.isEmpty()){
            
            TreeNode node = que.poll();
            TreeNode tmp = node.left;
            node.left = node.right;
            node.right = tmp;
            
            if(node.left != null){
                que.offer(node.left);
            }
            
            if(node.right != null){
                que.offer(node.right);
            }
        }
        
        return root;
    }
}
