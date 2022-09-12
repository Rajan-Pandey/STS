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
	
	void delete(int key)
	{
		root = deleteKey(root, key);
	}
	
	Node deleteKey(Node root , int key)
	{
		if( root == null)		
			return root;
		//Traverse left or right subtree for deletion
		if(key < root.key)
			root.left = deleteKey(root.left,key);
		else if(key > root.key)
			root.right = deleteKey(root.right,key);

		//If current node contains key
		else
		{
		
		 if(root.left == null)			//if left sub tree is null , replace root by right child
		 	return root.right;
		 else if(root.right == null)			// if right sub tree is null , replace root by left child
		 	return root.left;
		 
			// when node has both left and right child , replace by inorder successor , which is min node in right sub tree
		 root.key = minValue(root.right);
		 
		 root.right = deleteKey(root.right , root.key);	 // delete inorder successor from right subtrr
		 
		 }
		 
		 return root;
		}
		
	int minValue(Node root)
	{
		int minVal = root.key;
		while(root.left != null)
		{
			minVal = root.left.key;
			root = root.left;
		}
		return minVal;
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
		{
			int k = sc.nextInt();
			bst.search(k);
			bst.delete(k);
			bst.inorder();
		}		
	}
}
