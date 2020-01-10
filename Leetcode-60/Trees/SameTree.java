package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class SameTree {
	
	public class TreeNode {
		private int val;
		private TreeNode left, right;
		
		public TreeNode(int val) {
			this.val = val;
			left = right = null;
		}
	}
	public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> queue = new LinkedList<>(); 
        
        
		if(p==null && q==null){
            return true;
        }
        
        if(p==null || q==null){
            return false;
        }
        
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    
    }
}
