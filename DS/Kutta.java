import java.util.*;
  // Cretae BST from inorder and preorder 
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

public class Kutta
{
static int k  = 0;
static Node buildTree(int[] in , int[] pre , int start, int end)
{
if(start > end)
	return null;

Node root = new Node(pre[k++]);
if(start == end)
	return root;

int index = search(in, root.data);

root.left = buildTree(in,pre,start,index-1);
root.right = buildTree(in,pre,index+1,end);

return root;

}

static int search(int[] in , int data)
{
	for(int i =0; i<in.length; i++)
		if(in[i] == data)	
			return i;
return -1;
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
Kutta kutta  = new Kutta();
Scanner sc = new Scanner(System.in);
int[] in = {1,2,4,5,6,7,8};
int[] pre = {1,2,4,5,6,8,7};

Node root = kutta.buildTree(in,pre,0,in.length-1);
kutta.inorder(root);
}
}
