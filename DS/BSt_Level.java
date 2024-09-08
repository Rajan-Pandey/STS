import java.util.*;

class Node
{
int data;
Node left,right;

Node (int data)
{
this.data  = data;
this.left = this.right = null;
}

}

public class BSt_Level
{
Node node;

BSt_Level()
{
this.node = null;
}

BSt_Level(int data)
{
	node = new Node(data);
}


public void insert(int data)
{
	node = insertKey(node,data);
}

public Node insertKey(Node node, int data)
{
if(node != null)
	{
		 if(data < node.data)
		 node.left = insertKey(node.left, data);
		 else
		 node .right = insertKey(node.right, data);
	}
	else
	{
		node = new Node(data);
		return node;
	}
	return node;
}

public void In()
{
ArrayList<Integer> list = new ArrayList<>();
	Inorder(node,list);
	for(int a : list)	
		System.out.print(a + " ");
	System.out.println();	
}

public void Inorder(Node node, ArrayList<Integer>list)
{
	if(node != null)
	{	
		Inorder(node.left,list);
		list.add(node.data);
		Inorder(node.right,list);
	}		
}


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

BSt_Level bst = new BSt_Level();

int temp;
while(! ((temp = sc.nextInt()) == -1))
  {
	bst.insert(temp);	
  }
  
  	bst.In();	
}
}
