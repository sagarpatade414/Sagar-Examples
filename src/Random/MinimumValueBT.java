package Random;

public class MinimumValueBT {
	
	static Node head;
	
	public Node insert(Node node, int data) {
		
		if(node == null) {
			return new Node(data);
		} else {
			
			if(data < node.data) {
				node.left = insert(node.left, data);
			} else {
				node.right = insert(node.right, data);
			}
		}
		
		return node;
	}
	
	
	public int minValue(Node node) {
		Node current = node;
		
		while(current.left != null) {
			current = current.left;
		}
		
		return current.data;
	}
	
	public int maxValue(Node node) {
		Node current = node;
		
		while(current.right != null) {
			current = current.right;
		}
		
		return current.data;
	}
	
	public class Node {
		private int data;
		private Node left, right;
		
		public Node(int data) {
			this.data = data;
			right = left = null;
		}
	}
	
	
	public static int findHeightOfTree(Node node) {
		Node currentleft = node;
		Node currentright = node;
		
		if(node == null){
			return -1;
		} else {
			int leftCount=0;
			int rightCount=0;
			
			while(currentleft.left != null) {
				currentleft = currentleft.left;
				leftCount++;
				System.out.println("leftCount : " + leftCount); 				
			}
			
			while(currentright.right != null) {
				currentright = currentright.right;
				System.out.println("current : " + currentright.data);
				rightCount++;
				System.out.println("rightCount : " + rightCount); 
			}
			
			return Math.max(leftCount, rightCount);
			
		}
		
		
		
	}
	
	
	public static void main(String[] args) { 
		MinimumValueBT tree = new MinimumValueBT(); 
        Node root = null; 
        root = tree.insert(root, 4); 
         
        tree.insert(root, 2); 
        tree.insert(root, 1); 
        tree.insert(root, 3); 
        tree.insert(root, 6); 
        tree.insert(root, 5); 
        tree.insert(root, 9);
        tree.insert(root, 10);
        tree.insert(root, 11);
  
        System.out.println("Minimum value of BST is " + tree.minValue(root)); 
        System.out.println("Max value of BST is " + tree.maxValue(root)); 
        
        System.out.println("Height of BST " + findHeightOfTree(root)); 
    } 
	
	
}
