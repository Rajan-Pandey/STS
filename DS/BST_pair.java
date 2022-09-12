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

public class BST_pair
{
Node root;

ArrayList<Integer> list;

BST_pair() { root =  null; list = new ArrayList<Integer>();}
BST_pair(int data) { root = new Node(data); list = new ArrayList<Integer>(); }

void insert(int data)
{
	root = insertRec(root,data);
}

Node insertRec(Node root,int data)
{
	if(root == null)
		return root = new Node(data);
	if(data < root.data)
	 root.left = insertRec(root.left,data);
	else root.right = insertRec(root.right,data);
	
	return root;
}

void inorder()
{
	inorderRec(root,list);
}

void inorderRec(Node root , ArrayList<Integer> list)
{
	if(root != null)
	{
		inorderRec(root.left,list);
		list.add(root.data);
		inorderRec(root.right,list);
	}
}

public static void main(String[] args)
{
	BST_pair pair = new BST_pair();
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter node values to be inserted :");
	String[] str = sc.nextLine().split("\\s+");
	System.out.print("Enter required Sum : ");
	int k = sc.nextInt();
	for(int i =0; i<str.length; i++)
		pair.insert(Integer.parseInt(str[i]));
	pair.inorder();
	System.out.println(pair.list);
	boolean flag = false;
	int start = 0;
	int end = pair.list.size()-1;
	while(start < end)
	{
	 int a = pair.list.get(start) ;
	 int b = pair.list.get(end);
	 if( a+b == k)
	 {
		flag = true;
		System.out.print("(" + a + "," + b + ")");
		start++; end--;
	 }	
	else if( a+b > k)
		end--;
	else if(a+b < k)
		start++;
      }	
	if(!flag)
		System.out.print("No Pair found with sum = " + k);
}
}
