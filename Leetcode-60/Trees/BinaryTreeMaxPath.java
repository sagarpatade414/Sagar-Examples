package Trees;

public class BinaryTreeMaxPath {
	
	
	int maxSum;
    
    public int maxPathSum(TreeNode root) {
       maxSum = Integer.MIN_VALUE; 
       pathSum(root);
       return  maxSum;  
    }
    
    private int pathSum(TreeNode root){
        if(root == null){
            return 0;
        }
        
        int left = Math.max(0,pathSum(root.left));
        int right = Math.max(0,pathSum(root.right));
        
        maxSum = Math.max(maxSum, left + right + root.val);
        return Math.max(left,right)+root.val;
    }
    
    public class TreeNode {
	     int val;
	     TreeNode left;
		 TreeNode right;
		 TreeNode(int x) { val = x; }
   }
}
