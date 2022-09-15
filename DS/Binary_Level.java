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

public class Binary_Level
{
static Node root;

Binary_Level() { root = null;}
Binary_Level(int key) 
{
	root = new Node(key);
}

void levelorder(Node root)
{
Deque<Node> q = new LinkedList<Node>();

q.add(root);

while(!q.isEmpty())
{
	Node node = q.poll();
	if(node == null)
		return;
	
	System.out.print(node.key + " ");
	if(node.left != null)
		q.add(node.left);
		
	if(node.right != null)
		q.add(node.right);
}
}

public static void main(String[] args)
{
Binary_Level level = new Binary_Level(1);
root.left = new Node(5);
root.right = new Node(4);
root.left.left = new Node(3);
root.left.right = new Node(2);
root.right.right = new Node(8);
root.right.left = new Node(7);
root.right.right.left = new Node(10);
root.right.right.right = new Node(11);


level.levelorder(root);
}
}
