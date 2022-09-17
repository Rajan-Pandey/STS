import java.util.*;

class Node
{
int key;
Node left = null;
Node right = null;

Node(int key)
{
this.key = key;
}
}


public class BST_Structural
{

static Scanner s = new Scanner(System.in);

public static Node createTree()
{
	Node root = null;
	int val = s.nextInt();
	while(val != -1)
	{
		root = insert(root,val);
		val = s.nextInt();
	}
	return root;
}

public static Node insert(Node root,int key)
	{
		if(root == null)
			return new Node(key);
		if(root.key < key)
			root.right = insert(root.right,key);
		else root.left = insert(root.left,key);
	 return root;	
	}

public static boolean IsSame(Node n1, Node n2)
{
	if(n1 == null && n2 == null)
		return true;
	
	if(n1 != null && n2 != null)
			return (IsSame(n1.left,n2.left) && IsSame(n1.right,n2.right));

	return false;
}

public static int getHeight(Node n)
{
if(n == null)
	return 0;

 return  1+ Math.max(getHeight(n.left), getHeight(n.right));

}

public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

Node[] tree = new Node[n];

for(int i =0; i<n; i++)
	tree[i] = createTree();

for(int i =1; i<n; i++)
	{
			if(IsSame(tree[0],tree[i]))
				System.out.println("YES 0");
			else
				System.out.println("NO " + (getHeight(tree[i]) - getHeight(tree[0])));
	}


}
}
