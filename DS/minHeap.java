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

public class minHeap
{

Node root;
Node heap;
ArrayList<Integer> in = new ArrayList<Integer>();
ArrayList<Integer> res = new ArrayList<Integer>();

minHeap()
{
	this.root = null;
	this.heap = null;
}

void insert(int data)
{
	root = insertRec(root, data);
}

Node insertRec(Node root, int data)
{
	if( root == null )
		root = new Node(data);
	else
	{
		if(root.data < data)
			root.right = insertRec(root.right, data);
		else
			root.left = insertRec(root.left, data);
		}
	return root;
}


void Inorder(Node node, ArrayList<Integer> in)
{
if(node == null)
	{
	System.out.println("Tree is empty");
			System.exit(0);
	}
	InorderRec(node, in);	
	for(int a : in)
		System.out.print( a + " "); 
	System.out.println();
}

void InorderRec(Node root, ArrayList<Integer> in)
{
	if(root != null)
	{
		InorderRec(root.left, in);
		in.add(root.data);
		InorderRec(root.right, in);
	}	
}

void heapify()
{
if(in.size() == 0)
		{
			System.out.println("Tree is empty");
			System.exit(0);
		}
else
{
	heap = heapifyImpl(heap, in , 0); 
}
System.out.print("Inorder of min Heap : " );
Inorder(heap, res);
}

Node  heapifyImpl(Node heap, ArrayList<Integer> list, int i)
{
	if( i < list.size() && heap == null)
		heap = insertRec(heap, list.get(0));
	if( i*2 + 1 < list.size())
	{
		heap.left = insertRec(heap.left, list.get(i*2+1));
		heapifyImpl(heap.left, list, i*2+1);
		}
	if(i*2 + 2 < list.size())
	{
		heap.right = insertRec(heap.right, list.get(i*2+2));
		heapifyImpl(heap.right, list, i*2+2);
		}
		return heap;
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
minHeap min = new minHeap();
int temp;
while(sc.hasNext())
{
	temp = sc.nextInt();
	if(temp == -1)
		break;
	min.insert(temp);
}
System.out.print("Inorder Traversal :"); 
min.Inorder(min.root,min.in);
min.heapify();
}
}

