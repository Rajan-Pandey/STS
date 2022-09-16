//{ Driver Code Starts

/*Given a string str of length N, you have to find number of palindromic subsequence (need not necessarily be distinct) present in the string str.
Note: You have to return the answer module 109+7;
 */
import java.util.*;
class SubSequence
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			//System.out.println(str.length());
			Solution ob  = new Solution();
			System.out.println(ob.countPS(str));
		t--;
		}
	}
}
// } Driver Code Ends


/*You are required to complete below method */

class Solution
{
    long countPS(String str)
    {
        // Your code here
        long count = 0;
        ArrayList<String> list = new ArrayList<String>();
        allSub(str,"",list);
       
       for(String a : list)
       {
           if(isPalindrome(a))
            count++;
       }
        return count%1000000007;
    }
    
    
    void allSub(String str, String ans, ArrayList<String> list)
    {
        if(str.length() == 0)
        {
            list.add(ans);
            return;
        }
        
        allSub(str.substring(1) , ans + str.charAt(0), list);
        allSub(str.substring(1),ans,list);
    }
    
    boolean isPalindrome(String a)
    {
        if(a.length() == 0)
            return false;
        if(a.length() == 1)
            return true;
        for(int i =0 , j= a.length()-1 ; j>i; i++ , j--)
        {
            if(a.charAt(i) != a.charAt(j))
                return false;
        }
            
            return true;
            
    }
}
