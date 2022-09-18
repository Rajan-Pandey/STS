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

public class LCA_Practice
{

static Scanner s = new Scanner(System.in);
static Node insert()
{

Node root = null;
int val =s.nextInt();
while(val != -1)
{
root = insertRec(root,val);
val = s.nextInt();
}
return root;
}

static void inorder(Node root)
{
if(root != null)
{
inorder(root.left);
System.out.print(root.key + " ");
inorder(root.right);
}
}
static Node insertRec(Node root, int key)
{
if(root == null)
	return new Node(key);
if(key < root.key)
	root.left = insertRec(root.left,key);

else
	root.right = insertRec(root.right,key);
return root;
}

static Node getLCA(Node root , int n1, int n2)
{
	if (root == null)
		return null;
	if(root.key == n1 || root.key == n2)
		return root;
	
	Node l = getLCA(root.left, n1 , n2);
	Node r = getLCA(root.right , n1 , n2);
	if(l != null && r!= null)	
		return root;
	
	return l != null ? l : r;
	
}

public static void main(String[] args)
{
Node[] trees = new Node[5];
Scanner sc = new Scanner(System.in);
for(int i =0; i<5;i++)
	trees[i] = insert();

for(int i =0; i<5;i++)
{
	inorder(trees[i]);
}


for(int i =0; i<5;i++)
{
	System.out.print("Enter nodes to find LCA : ");	;
	int n1 = sc.nextInt();
	int n2 = sc.nextInt();
	Node LCA = getLCA(trees[i] ,n1 , n2);
	System.out.println("LCA is  : " + LCA.key);
}


}
}
