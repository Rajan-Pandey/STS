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

public class BST_level
{

Node node;
ArrayList<Integer> list = new ArrayList<Integer>();
Queue<Node> q = new LinkedList<>();
ArrayList<Integer> count = new ArrayList<>();
BST_level()
{
	this.node = null;
}

void insert(int key)
{

node = insertRec(node, key);

}

Node insertRec(Node node, int key)
{
if(node != null)
	{
		if(node.key < key)
			node.right = insertRec(node.right,key);
		else
			node.left = insertRec(node.left, key);
	}
else
	{
	node = new Node(key);
	}
	
	return node;
}

void Inorder()
{
	in(node,list);
	for(int a : list)	
		System.out.print(a + " ");
	System.out.println();		
}

void in(Node node, ArrayList<Integer> list)
{
	if(node != null)
	{
		in(node.left, list);
		list.add(node.key);
		in(node.right,list);
	}	
}

void level()
{
	if(node != null)
	{
	q.add(node);
	levelOrder(node,q);	
	}
	else
	System.out.println("Tree is empty");
}

void levelOrder(Node node, Queue<Node> q)
{
	while(!q.isEmpty())
	{
	Node tmp = q.poll();
		if(tmp.left != null)
			q.add(tmp.left);
		if(tmp.right != null)
			q.add(tmp.right);
	System.out.print(tmp.key + " ");
	}
	System.out.println();
}

void levelcount()
{
	//int i =0;
	if(node != null)
	{
	count.add(0);
	levelcountImpl(node,count,0);
	}
	for(int j =0; j<count.size(); j++)
	{
		System.out.println("Level " + j + " : " + count.get(j));
	}
}

void levelcountImpl(Node node, ArrayList<Integer> count, int i)
{
	if(node != null)
	{	if( i == count.size())
		{
			count.add(1);
		}
		else
		{
		int tmp = count.get(i);
		count.set(i, ++tmp);
		}
		++i;
		levelcountImpl(node.left, count, i);
		levelcountImpl(node.right, count, i);
	}
}

public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
BST_level bst = new BST_level();

int temp;

while(!((temp = sc.nextInt()) == -1))
{
	bst.insert(temp);

}
bst.Inorder();
bst.level();
bst.levelcount();
}
}
