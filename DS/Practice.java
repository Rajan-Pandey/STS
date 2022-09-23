class Node
{
int data;
Node left, right;
int height;
Node(int data)
{
this.data = data;
this.left = this.right = null;
this.height = 1;
}



public class Practice
{

Node root;

Practice() { root = null; }

Practice(int data) {	root = new Node(data); }


Node deleteRec(Node root, int key)
{
if(root == null)
	return root;

if(key < root.data)
	root.left = deleteRec(root.left,key);
else if(key > root.data)
	root.right = deleteRec(root.right,key);
else
{
if(root.left == null)
	return root.right;
else if(root.right == null)
	return root.left;

root.data = minValue(root.right);
root.right = deleteRec(root.right,root.data);
}

root.height = 1 + Math.max(left,right); //getHeight()
int balance = getBalance(root);   // if root null then 0 else heigth_left - height_right;

}

}

public static void main(String[] args)
{



}


}
