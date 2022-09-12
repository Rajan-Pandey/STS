import java.util.*;

class Node
{
int data;
Node left , right;
Node(int data)
{
this.data = data;
this.left = this.right = null;
}
}

public class Binary
{
Node root;

static int preIndex = 0;

Binary() { root = null;}

Binary(int data) { root = new Node(data); }

void constructTree(ArrayList<Integer> pre , ArrayList<Integer> in, int start , int end)
{
	root = construct( pre, in, start, end);
}

Node construct(ArrayList<Integer> pre , ArrayList<Integer> in , int start , int end)
{
	if(start > end)
		return null;
	
	
	Node node = new Node(pre.get(preIndex++));
	
	
	int index = in.indexOf(node.data);
	
	if(start == end)
		return node;
	node.left = construct(pre,in,start,index-1);
	node.right = construct(pre,in,index+1,end);
	
	return node;
}

void inorder(Node root)
{
if(root!=null)
{
	inorder(root.left);
	System.out.print(root.data + " ");
	inorder(root.right);
}
}

public static void main(String[] args)
{

Binary b = new Binary();
Scanner sc = new Scanner(System.in);
System.out.print("Enter no of Nodes : ");
int n = sc.nextInt();
ArrayList<Integer> pre = new ArrayList<Integer>();
ArrayList<Integer> in = new ArrayList<Integer>();

System.out.print("Enter Pre Order Traversal : ");
	for(int i =0; i<n; i++)
		pre.add(sc.nextInt());
System.out.print("Enter In Order Traversal : ");
	for(int i =0; i<n; i++)
		in.add(sc.nextInt());

	b.constructTree(pre,in,0,in.size()-1);
	b.inorder(b.root);
}


}
