package FacebookLeetcode;

public class ConvertBTtoDLL {
	
	class Node {
	    public int val;
	    public Node left;
	    public Node right;

	    public Node() {}

	    public Node(int _val) {
	        val = _val;
	    }

	    public Node(int _val,Node _left,Node _right) {
	        val = _val;
	        left = _left;
	        right = _right;
	    }
	};
	
	public Node treeToDoublyList(Node root) {
        if(root == null){
            return root;
        }
        
        Node leftNode = treeToDoublyList(root.left);
        Node rightNode = treeToDoublyList(root.right);
        
        root.left = root;
        root.right = root;
        
        root = concatNode(leftNode, root);
        root = concatNode(root, rightNode);
        
        return root;
        
    }
    
    public Node concatNode(Node a, Node b){
        if(a == null){
            return b;
        }
        
        if(b == null){
            return a;
        }
        
        Node aEnd = a.left;
        Node bEnd = b.left;
        
        a.left = bEnd;
        bEnd.right = a;
        aEnd.right = b;
        b.left = aEnd;
        
        return a;
    }
}
