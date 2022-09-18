import java.util.*;

class Node
{

int data;
Node left, right;
Node(int data)
{
this.data = data;
this.left = this.right = null;
}
}

public class LCA
{
static Node root;

LCA()  { root = null; }

LCA(int data) { root = new Node(data); }

Node lca(int n1, int n2)
{
	Node node = lca_node(root,n1,n2);
	return node;
}

Node lca_node(Node root,int n1,int n2)
{
	if(root == null)
		return null;
	if(root.data == n1 || root.data == n2)
		return root;

	Node ll = lca_node(root.left , n1, n2);
	Node rl = lca_node(root.right , n1 , n2);
	
	if(ll != null && rl != null)
		return root;

	return ll !=  null ? ll : rl;
}

	void inorder(Node root)
	{
		if(root != null)
		{
			inorder(root.left);
			System.out.print(root.data + " ");
			inorder(root.right);
		}
	}
	
	int findLevel(Node root, int n  , int level)
	{
		if(root == null)
			return -1;
		if(root.data == n)
			return level;
		
		int le = findLevel(root.left,n,level+1);
		if(le == -1)
			return findLevel(root.right , n, level+1);
		return le;
	}

	public static void main(String[] args)
	{
		LCA l = new LCA();
		l.root = new Node(1);
        	l.root.left = new Node(2);
        	l.root.right = new Node(3);
        	l.root.left.left = new Node(4);
        	l.root.left.right = new Node(5);
        	l.root.right.left = new Node(6);
        	l.root.right.right = new Node(7);
		l.root.left.left.left = new Node(9);
		l.root.left.left.right = new Node(10);
		l.root.left.right.left = new Node(11);	
		l.root.left.right.right = new Node(12);
 		
		Node  node = l.lca(9,11);
		int level1 = l.findLevel(node,9,0);
		int level2 = l.findLevel(node,11,0);
		Scanner sc = new Scanner(System.in);
		int val = sc.nextInt();
		int level_val = l.findLevel(node,val,0);
		
		if(val == 9 || val == 11)
			System.out.println("Yes");
		else if(level_val == -1  || level_val >= level1 || level_val >= level2)
			System.out.println("No");
		else System.out.println("Yes");
		
        	/*System.out.println("LCA(4, 5): " + l.lca(4,5));
        	System.out.println("LCA(4, 6): " + l.lca(4,6));
        	System.out.println("LCA(3, 4): " + l.lca(3,4));
       		System.out.println("LCA(2, 4): " + l.lca(2,4)); */
	}
}
