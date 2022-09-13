import java.util.*;

class Node
{
int key;
Node left , right;
Node(int key)
{
this.key = key;
this.left = this.right = null;
}
}

public class LCA_BST
{
Node root;

LCA_BST() { root = null; }
LCA_BST(int key) { root = new Node(key); }

void insert(int key)
{
	root =insertRec(root , key);
} 

Node insertRec(Node root , int key)
{
	if(root == null)
	 return root = new Node(key);

	if(key < root.key)
		root.left = insertRec(root.left, key);
	else if( key > root.key)
		root.right =insertRec(root.right , key);
	
	return root;
}

int findLCA(int n1, int n2)
{
	Node node = findLCA(root , n1, n2);
	return node.key;
}

Node findLCA(Node root , int n1, int n2)
{
	if(root == null)
		return null;
	if(root.key < n1 && root.key < n2)
		return findLCA(root.right, n1 , n2);
	if(root.key > n1 && root.key > n2)
		return findLCA(root.left , n1, n2); 

	return root;		
}


public static void main(String[] args)
{
	LCA_BST bst = new LCA_BST();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter nodes to be inserted in BST ( deliminated by -1) : ");
	while(sc.hasNext())
	{
		int temp = sc.nextInt();
		if(temp == -1)
			break;
		bst.insert(temp);
	}
	System.out.println("LCA of 14 and 8 is " + bst.findLCA(14,8));
	System.out.println("LCA of 10 and 14 is " + bst.findLCA(10,14));
	System.out.println("LCA of 10 and 22 is " + bst.findLCA(10,22)); 	
}
}
