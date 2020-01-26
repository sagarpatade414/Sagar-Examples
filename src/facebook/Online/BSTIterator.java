package facebook.Online;

import java.util.Stack;

 

	public class BSTIterator {
	
		Stack<TreeNode> stack;
	    
	    public BSTIterator(TreeNode root) {
	        stack = new Stack<>();
	        fillStack(root);
	    }
	    
	    public void fillStack(TreeNode root){
	        while(root != null) {
	            stack.push(root);
	            root = root.left;
	        }
	    }
	    
	    /** @return whether we have a next smallest number */
	    public boolean hasNext() {
	        return !stack.isEmpty();
	    }
	
	    /** @return the next smallest number */
	    public int next() {
	        TreeNode curNode = stack.pop();
	        fillStack(curNode.right);
	        return curNode.val;
	    }
	    
	    public class TreeNode {
		      int val;
		      TreeNode left;
		      TreeNode right;
		      TreeNode(int x) { val = x; }
	    }
    
}
