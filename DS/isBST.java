//Logic to check if given tree is BST ot not 

public boolean isBST(Node root)
{
ArrayList<Integer> list = new ArrayList<Integer>();

inorderRec(root,list)

for(int i = 0  ; i<list.size()-2 ; i++)
	if(arr[i] > arr[i+1])   
		return false;         /*Inorder traversal is always sorted in increasing order for BST , if any element is found which is greater than 							its inorder successor then tree isn't BST*/ 							
return true;
}

void inorderRec(Node root, ArrayList<Integer> list)
{
if(rood != null)
{
inorderRec(root.left,list);
list.add(root.data);
inordeRec(root.right,list);
}
}
