package frogLeafFall;


public class createBinarySearchTree{
	
	public static void main(String[] args) {
		BST tree = new BST();
		Node root = null;
		tree.insert(root, 10);
		tree.insert(root, 20);
		tree.insert(root, 50);
		
	}
	
	
}

class Node{
	int data;
	Node left;
	Node right;
}

class BST{
	
	public Node createNode(int j) {
		Node a = new Node();
		a.data = j;
		a.left = null;
		a.right = null;
		
		return a;
		
	}
	
	public Node insert(Node node, int val) {
		if(node==null) return createNode(val);
		
		if(val<node.data) {
			node.left = insert(node.left, val);
		}else if(val>node.data){
			node.right = insert(node.right, val);
		}
		
		return node;
	}
}

