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

public class ancestors
{
Node root;
ancestors() { root = null; }

ancestors(int key) { root = new Node(key); }

void insert(int key)
{
	root = insertRec(root, key);
}

Node insertRec(Node root, int key)
{
	if(root == null)
		return root = new Node(key);
	if(key < root.key)
		root.left = insertRec(root.left , key);
	else if(key > root.key)
		root.right = insertRec(root.right , key);
	return root;
}

void printAncestor(int key)
{
	if(searchRec(root,key))
	{
	ArrayList<Integer> list = new ArrayList<Integer>();
	printAncestorRec(root, key , list);
	if(list.size() == 0)
		System.out.println(key + " is root node");
	else
	System.out.println("Ancestors of " + key + " are : "  + list);
	}	
	else System.out.println(key + " is not present in tree");
}

boolean searchRec(Node root, int key)
{
	if(root == null)
		return false;
	if(root.key == key)
		return true;
	if(key < root.key)
		return searchRec(root.left, key);
	if(key > root.key)
		return searchRec(root.right, key);
	
	return false;
	
}


boolean printAncestorRec(Node root, int key, ArrayList<Integer> list)
{
	if(root == null)
		return false;
	if(root.key == key)
		return true;
	if(printAncestorRec(root.left,key,list) || printAncestorRec(root.right,key,list))
	{
		list.add(root.key);
		return true;
	}
	return false;	
	
}
	public static void main(String[] args)
	{
		ancestors anc = new ancestors();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter nodes to be inserted : ");	
		while(sc.hasNext())
		{
			int temp = sc.nextInt();
			if(temp == -1)
				break;
			anc.insert(temp);
		}
		System.out.print("Enter nodes to find ancestors : ");
		while(sc.hasNext())
		{
			int temp = sc.nextInt();
			if(temp == -1)
				break;
			anc.printAncestor(temp);
		}
	}

}
