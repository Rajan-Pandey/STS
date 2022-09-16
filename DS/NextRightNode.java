//{ Driver Code Starts
//Initial Template for Java

/*Given a Binary tree and a key in the binary tree, find the node right to the given key. If there is no node on right side, then return a node with value -1.


       10
     /    \
    2      6
   / \      \
  8   4      5
and key = 2
Output: 6
Explanation: We can see in the above tree
that the next right node of 2 is 6.
*/


import java.io.*;
import java.util.*;
import java.lang.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class NextRightNode {
    
    static Node buildTree(String str){
        
        if(str.length()==0 || str.charAt(0)=='N'){
            return null;
        }
        
        String ip[] = str.split(" ");
        // Create the root of the tree
        Node root = new Node(Integer.parseInt(ip[0]));
        // Push the root to the queue
        
        Queue<Node> queue = new LinkedList<>(); 
        
        queue.add(root);
        // Starting from the second element
        
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            
            // Get and remove the front of the queue
            Node currNode = queue.peek();
            queue.remove();
                
            // Get the current node's value from the string
            String currVal = ip[i];
                
            // If the left child is not null
            if(!currVal.equals("N")) {
                    
                // Create the left child for the current node
                currNode.left = new Node(Integer.parseInt(currVal));
                // Push it to the queue
                queue.add(currNode.left);
            }
                
            // For the right child
            i++;
            if(i >= ip.length)
                break;
                
            currVal = ip[i];
                
            // If the right child is not null
            if(!currVal.equals("N")) {
                    
                // Create the right child for the current node
                currNode.right = new Node(Integer.parseInt(currVal));
                    
                // Push it to the queue
                queue.add(currNode.right);
            }
            i++;
        }
        
        return root;
    }
    static void printInorder(Node root)
    {
        if(root == null)
            return;
            
        printInorder(root.left);
        System.out.print(root.data+" ");
        
        printInorder(root.right);
    }
    
	public static void main (String[] args) throws IOException{
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        PrintWriter out=new PrintWriter(System.out);
	        int test = Integer.parseInt(br.readLine());
	        while(test-- > 0){
	            String s = br.readLine();
    	    	Node root = buildTree(s);
    	    	int key = Integer.parseInt(br.readLine());
        	    Sol obj = new Sol();
        	    Node res = obj.nextRight(root, key);
        	    out.println(res.data);
        }
        out.close();
    }
  
}

// } Driver Code Ends


//User function Template for Java

class Sol{
	Node nextRight(Node root, int key)
    {
		//Write your code here
	//ArrayList<Integer> list = new ArrayList<Integer>();
	Node res = level(root,key);
	
	return res;
    }
    
    Node level(Node root,int key)
    {
        if(root == null)
            return null;
        
        int level = 0;
        Deque<Node> q = new LinkedList<>();
        Deque<Integer> l = new LinkedList<>();
        
        q.add(root);
        l.add(level);
        
        while(!q.isEmpty())
        {
            Node temp = q.pop();
            level  = l.pop();

            
            if(temp.data == key)
            {
                if(l.size() == 0 || l.peek() != level)
                    return new Node(-1);
                return q.peek();
            }
            
            //list.add(temp.data);
            
            if(temp.left != null)
            {
                q.add(temp.left);
                l.add(level+1);
            }
            if(temp.right != null)
            {
                q.add(temp.right);
                l.add(level+1);
            }
        }
        
        return null;
    }
    
   
}
