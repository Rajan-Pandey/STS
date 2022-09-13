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

int lca(int n1, int n2)
{
	Node node = lca_node(root,n1,n2);
	return node.data;
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
 
        	System.out.println("LCA(4, 5): " + l.lca(4,5));
        	System.out.println("LCA(4, 6): " + l.lca(4,6));
        	System.out.println("LCA(3, 4): " + l.lca(3,4));
       		System.out.println("LCA(2, 4): " + l.lca(2,4));
	}
}
