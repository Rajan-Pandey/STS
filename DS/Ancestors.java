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

public class Ancestors
{
Node root;
Ancestors()
{
this.root = null;
}

void Insert(int key)
{
	root = InsertRec(root, key);
}

Node InsertRec(Node root, int key)
{
	if( root == null)
		root = new Node(key);
	else
	{
		if(key > root.key)
			root.right = InsertRec(root.right, key);
		else
			root.left = InsertRec(root.left , key);
		}
		return root;
}

void printAncestor(int key)
{
	ArrayList<Integer> list = new ArrayList<Integer>();
	printAncestorRec(root, key,list);
	if(list.size() == 0)
		System.out.println("It is root node, so no ancestors");
	else	
	{
	for(int a : list)
		System.out.print(a + " ");
		}
}

boolean printAncestorRec(Node root, int key, ArrayList<Integer> list)
{
	if(root == null)
		return false;
	if( root.key == key)
		return true;
	if(printAncestorRec(root.left, key, list) || printAncestorRec(root.right, key, list))
		{
			list.add(root.key);
			return true;
		}
	return false;
}


public static void main(String args[])
{
Ancestors anc = new Ancestors();
Scanner sc = new Scanner(System.in);
ArrayList<Integer> d = new ArrayList<Integer>();
int tmp;
while(sc.hasNext())
{
	tmp = sc.nextInt();
	if(tmp == -1)
		break;
	d.add(tmp);
	anc.Insert(tmp);
}

int key = sc.nextInt();
	if(d.contains(key))
		anc.printAncestor(key);
	else
		System.out.println("Key not present in tree");
}

}
