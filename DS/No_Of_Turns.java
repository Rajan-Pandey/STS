/*Given a binary tree and data value of two of its nodes. Find the number of turns needed to reach from one node to another in the given binary tree.
Input:      
Tree = 
           1
        /    \
       2       3
     /  \     /  \
    4    5   6    7                        
   /        / \                        
  8        9   10   
first node = 5
second node = 10
Output: 4
Explanation: 
Turns will be at 2, 1, 3, 6.

Example 2:

Input:      
Tree = 
           1
        /     \
       2        3
     /  \      /  \
    4    5    6    7                        
   /         / \                        
  8         9   10   
first node = 1
second node = 4  
Output: -1
Explanation: No turn is required since 
they are in a straight line.  


Algo : 

    Find the LCA of given two node.
    If none of the 2 nodes is equal to LCA this means that one lies on the left side of LCA and the other on right side. Count the number of turns     needed to reach LCA from both sides and then sum their count. 
    If one of the nodes is equal to LCA then we only need to count the turns needed for the other node to reach the LCA. 


*/

import java.util.LinkedList; 
import java.util.Queue; 
import java.io.*;
import java.util.*;

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

class No_Of_Turns {
    
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
    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());

        while(t > 0){
            String s = br.readLine();
            Node root = buildTree(s);
            
            String line = br.readLine();
            String[] splitLine = line.split(" ");
            int nd1 = Integer.parseInt(splitLine[0]);
            int nd2 = Integer.parseInt(splitLine[1]);
            int turn;

            Solution ob = new Solution();
            if((turn = ob.NumberOfTurns(root, nd1, nd2)) != 0)
              System.out.println(turn);
            else
              System.out.println("-1");
            t--;
        }
    }
}

// } Driver Code Ends



class Solution
{
    static int NumberOfTurns(Node root, int first, int second)
    {
        //your code here
        ArrayList<String> merged = new ArrayList<String>();
        ArrayList<String> f = new ArrayList<String>();
        ArrayList<String> s = new ArrayList<String>();
        
       Node lca = findLca(root,first,second);
        
        int count = 0;
        
    
        boolean res1 = searchRec(lca,first,f);
        boolean res2 = searchRec(lca,second,s);
        

        for(int i =0; i<f.size();i++)
            merged.add(f.get(i));
        
        for(int i = s.size()-1; i>=0;i--)
            merged.add(s.get(i));
       
       for(int i =0; i<merged.size()-1; i++)
       {
           if(!merged.get(i).equals(merged.get(i+1)))
            count++;
       }
       
     return count == 0 ? -1 : count;
    }
    
    public static Node findLca(Node root , int n1, int n2)
    {
        if(root == null)
            return null;
        if(root.data == n1 || root.data == n2)
            return root;
        Node l = findLca(root.left,n1,n2);
        Node r = findLca(root.right,n1,n2);
        
        if(l != null && r!= null)
            return root;
        if(l == null && r == null)
            return null;
        return l != null ? l : r;
    }
    
    public static boolean searchRec(Node root , int n,ArrayList<String> list)
    {
        if(root == null)
            return false;
        if(root.data == n)
            return true;
        
        boolean l =  searchRec(root.left,n,list);
        boolean r = searchRec(root.right,n,list);
        
        if(l == true)
            list.add("L");
        else if(r == true)  
            list.add("R");
        
     if(l || r)
        return true;
    return false;
    }
}
