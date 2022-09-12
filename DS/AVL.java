import java.util.*;

class Node
{
int key;
int height;

Node left, right;

Node(int key)
{
	this.key = key;
	this.height = 1;
	this.left = this.right = null;
}
}

public class AVL
{
 Node root;
 
 AVL() { root = null; }
 
 AVL(int key) {	root = new Node(key); }
 
 int getHeight(Node root)
 {
 	if(root == null)
 		return 0;
 		
 	return root.height;
 }
 
 int getBalance(Node root)
 {
 	if(root == null)
 		return 0;
 	
 	return getHeight(root.left) - getHeight(root.right);
 }
 
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
 	
 	else if(key < root.key)
 		root.left = insertRec(root.left , key);
 	else if(key > root.key)
 		root.right = insertRec(root.right , key);
 	else
 		return root;   //Duplicate values not allowed
 	
 	//update height of ancestor node 
 		
 	root.height = 1 + Math.max(getHeight(root.left) , getHeight(root.right));
  
  int balance = getBalance(root);
  
   if(balance > 1 && key < root.left.key)
	{
		System.out.println("Right Rotation");
   		 return rightRotate(root);
	}
   		
   if(balance > 1 && key > root.left.key)
   		{
			System.out.println("Left Rotation + Right Rotation");
   			root.left = leftRotate(root.left);
   			return rightRotate(root);
   		}  
	
	 if(balance < -1 && key > root.right.key)
			{
				System.out.println("Left Rotation");
				return leftRotate(root);
			}
		
	 if(balance < - 1 && key < root.right.key)
	 		{
				System.out.println("Right Rotation + Left Rotation");
	 			root.right = rightRotate(root.right);
	 			return leftRotate(root);
	 		}   		
   	
   	return root;
 	
 }
 
 Node rightRotate(Node root)
 {
 		Node y = root.left;
 		Node T1 = y.right;
 		
 		//Perform roatation
 		
 		y.right = root;
 		root.left = T1;
 		
 		y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
 		root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
 		
 		return y;
 }

	Node leftRotate(Node root)
	{
	Node y = root.right;
	Node T1 = y.left;
	
	//Perform Rotation
	y.left = root;
	root.right = T1;
	
	y.height = 1 + Math.max(getHeight(y.left), getHeight(y.right));
 	root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
 	
	return y;
	}
	
	void inorder()
	{
		inorderRec(root);
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
	void preorder()
	{
			preorderRec(root);
	}
	
	void preorderRec(Node root)
	{
	if(root != null)
	{
		System.out.print(root.key + " ");
		preorderRec(root.left);
		preorderRec(root.right);
	}
	}
	public static void main(String[] args)
	{
		AVL avl = new AVL();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nodes to be inserted in AVL Tree : ");
		String[] s = sc.nextLine().split("\\s+");
		for(int i =0; i<s.length ; i++)
		{
			avl.insert(Integer.parseInt(s[i]));
		}
		avl.inorder();
		System.out.println();
		avl.preorder();
		System.out.println();
	}
}
