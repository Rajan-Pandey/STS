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

public class BST_Common
{
Node root;

BST_Common() { root = null;}
BST_Common(int key) { root = new Node(key);}

void insert(int key)
{
root = insertRec(root,key);
}

Node insertRec(Node root , int key)
{
if(root == null)
	return root = new Node(key);

if(root.key < key)
	root.right = insertRec(root.right, key);
else if(root.key > key)
	root.left = insertRec(root.left, key);

return root;
}

Node findLca(int n1 , int n2)
{
Node node = findLcaRec(root,n1,n2);
return node;
}

Node findLcaRec(Node root, int n1, int n2)
{
if(root == null)
	return null;

if(n1 > root.key && n2 > root.key)
	return findLcaRec(root.right,n1,n2);

if(n1 < root.key && n2 < root.key)
	return findLcaRec(root.left,n1,n2);

return root;
}

public void printAncestors(int target)
{
	printAncestorsRec(root,target);
}

public void printAncestorsRec(Node root, int target)
{
	if(root == null)
	return;
	if(root.key == target)
	{
		System.out.print(root.key + " ");
	return;
	}

	else if(target > root.key)
	{
		System.out.print(root.key + " ");
		printAncestorsRec(root.right, target);
	}
	else 
	{
	System.out.print(root.key + " ");	
	printAncestorsRec(root.left,target);
	}
}
	public static void main(String[] args)
	{
		BST_Common common = new BST_Common();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNext())
		{
			int temp = sc.nextInt();
			if(temp == -1)  break; 
			common.insert(temp);
		}

		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		Node node = common.findLca(n1,n2);
		System.out.println("Printing common ancestors : ");
		common.printAncestors(node.key);

	}

}



