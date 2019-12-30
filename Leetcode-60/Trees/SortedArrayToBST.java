package Trees;

public class SortedArrayToBST {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	
	
	public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums == null || nums.length == 0){
            return null;
        }
        
        TreeNode head = constructBSTRecursive(nums, 0, nums.length-1);
        return head;
    }
    
    private TreeNode constructBSTRecursive(int[] nums, int left, int right){
        if(left > right){
            return null;
        }
        
        int mid = left + (right - left)/2;
        TreeNode current = new TreeNode(nums[mid]);
        current.left = constructBSTRecursive(nums, left, mid-1);
        current.right = constructBSTRecursive(nums, mid+1, right);
        return current;
    }
}
