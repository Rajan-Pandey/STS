import java.util.*;

class Node
{
	int key;
	Node left,right;

	Node(int value)
		{
		this.key = value;
		left = null;
		right = null;
		}
}

public class BST
{
	Node root;

	BST() { this.root = null; }

	BST(int key) {  root = new Node(key); }

	void insert(int key)
	{
	root = insertRec(root, key);
	}	

	Node insertRec(Node root , int key)
	{
		if(root == null)
		{
			root = new Node(key);
			return root;
		}
	
		if(key < root.key)
			root.left = insertRec(root.left,key);
		else if(key >= root.key)
			root.right = insertRec(root.right, key);

	return root;
	}

	void inorder()
	{
	ArrayList<Integer> list = new ArrayList<Integer>();
	inorderRec(root,list);
	for(int a : list)
		System.out.print(a + " ");
	System.out.println();
	}

	void inorderRec(Node root, ArrayList<Integer> list)
	{	
	if(root != null)
		{
		inorderRec(root.left,list);
		list.add(root.key);
		inorderRec(root.right,list);	
		}
	}

	void preorder()
	{
	ArrayList<Integer> list = new ArrayList<Integer>();
	preorderRec(root,list);
	for(int a : list)
		System.out.print(a + " ");
	System.out.println();
	}
	
	void preorderRec(Node root , ArrayList<Integer> list)
	{
	if(root != null)
	{
	list.add(root.key);
	preorderRec(root.left,list);
	preorderRec(root.right,list);
	}
	}
	
	void search(int key)
	{
	ArrayList<String> list= new ArrayList<String>();
	list.add("ROOT");
	boolean flag = searchRec(root,key,list);
	
	if(flag)
		System.out.println(list);
	else
		System.out.println("Not Found");
	}
	
	boolean searchRec(Node root,int key, ArrayList<String> list)
	{
		if(root == null)
			return false;
		if(root.key == key)
			return true;
			
		if(key < root.key)
		{
			list.add("L");
			return searchRec(root.left,key,list);
		}
		
		if(key > root.key)
		{
			list.add("R");
			return searchRec(root.right,key,list);
		}
		return false;
			
	}
	public static void main(String[] args)
	{
				BST bst = new BST();
				bst.insert(50);
				bst.insert(30);
				bst.insert(20);
				bst.insert(40);
				bst.insert(70);
				bst.insert(60);
				bst.insert(80);
				
				bst.inorder();
				bst.preorder();
				bst.search(100);
	}
}

