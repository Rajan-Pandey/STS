import java.util.*;

class Node
{
int key;
Node left, right;

Node(int key)
{
	this.key = key;
	this.left = this.right = null;
}
}

public class BST_Preorder
{
	Node root;
	
	BST_Preorder() { root = null;}
	BST_Preorder(int key) { root = new Node(key); }
	
	void insert(int key)
	{
		root = insertKey(root, key);
	}
	
	Node insertKey(Node root , int key)
	{
	
	if(root == null)
	{
	root = new Node(key);
	return root;
	}
	
	if(key <= root.key)
		root.left = insertKey(root.left , key);
	else if (key > root.key)
		root.right = insertKey(root.right , key);
		
	return root;
	}
	
	public void inorder()
	{
		inorderRec(root);	
	}
	public void inorderRec(Node root)
	{
		if(root != null)
		{
			inorderRec(root.left);
			System.out.print(root.key + " ");
			inorderRec(root.right);
		}
	}
	public void leaf()
	{
		leafRec(root);
	}
	public void leafRec(Node root)
	{
		if(root == null)
		return;
		if(root.left == null && root.right == null)
			System.out.print(root.key  + " ");
		else 
		{
			leafRec(root.left);
			leafRec(root.right);
		}
	}



	public static void main(String[] args)
	{
		BST_Preorder bst = new BST_Preorder();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter PreOrder Traversal terminated by -1 : ");
		while(sc.hasNext())
		{
			int temp = sc.nextInt();
			if(temp == -1)
				break;
			bst.insert(temp);
		}
		System.out.print("Inorder Traversal is : ");
		bst.inorder();
		System.out.println();
		System.out.print("Printing leaf nodes (if any) : ");
		bst.leaf();
		System.out.println();
	}
}
