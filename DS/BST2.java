import java.util.*;

class Node
{
	int key;
	Node left,right;

	Node(int key)
	{
	this.key = key;	
	this.left = this.right = null;
	}
}

public class BST2
{
	Node root;

	BST2() { root = null; }

	BST2(int key) { root = new Node(key); }

	void insert(int key)
	{
		root = insertRec(root , key);
	}

	Node insertRec(Node root , int key)
	{
		if(root == null)
		{
				root = new Node(key);
				return root;
		}
	
		if(root.key >= key)
			root.left = insertRec(root.left , key);
		else 
		  root.right = insertRec(root.right , key);	
		  
		 return root;
	}
	
	
	void inorder()
	{
		inorderRec(root);
		System.out.println();
	}
	
	void inorderRec(Node root)
	{
	if(root != null)
	{
		inorderRec(root.left);
		System.out.print(root.key + " ");
		inorderRec(root.right);
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
		BST2 bst = new BST2();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter data to be inserted : ");
		String s = sc.nextLine();
		String[] arr = s.split("\\s+");
		for(int i =0 ; i< arr.length; i++)
				bst.insert(Integer.parseInt(arr[i]));
		
		bst.inorder();
		
		System.out.print("Enter no of searches : ");
		int n = sc.nextInt();
		int[] keys = new int[n];
		
		System.out.print("Enter search keys : ");
		for(int i =0; i<n; i++)
			bst.search(sc.nextInt());
		
	}
}
