
/*Given an input stream of A of n characters consisting only of lower case alphabets. The task is to find the first non repeating character, each time a character is inserted to the stream. If there is no such character then append '#' to the answer.

Input: A = "aabc"
Output: "a#bb"
Explanation: For every character first non
repeating character is as follow-
"a" - first non-repeating character is 'a'
"aa" - no non-repeating character so '#'
"aab" - first non-repeating character is 'b'
"aabc" - first non-repeating character is 'b'

Input: A = "pqrstpuvwqzua"
Output: "pppppqqqqrrrr"

*/


import java.util.*;


class non_repeating_char
{
    public static void main(String[] args) 
    {
       	    Scanner sc = new Scanner(System.in);
            System.out.print("Enter String : ");
	    String A = sc.nextLine();
            Solution ob = new Solution();
            String ans = ob.FirstNonRepeating(A);
            System.out.println(ans);
    }
}
class Solution
{
    public String FirstNonRepeating(String A)
    {
        Deque<Character> que = new LinkedList<Character>();
        
        int[] count = new int[26];
        
        count[A.charAt(0) - 'a']++;
        
        que.add((Character) A.charAt(0));
       
       String temp = "" + A.charAt(0);
       
       for(int i =1; i<A.length(); i++)
       {
          char ch = A.charAt(i);
          
          count[ch-'a']++;
          
          que.add((Character)ch);
          
         while (!que.isEmpty())
          {
          if(count[que.peek()-'a'] == 1 )
          {
            temp = temp +"" + que.peek();
            break;
          }
          else if(count[que.peek()-'a'] > 1)
            que.pollFirst();
          }
                    
          if(que.isEmpty())
          {
            temp = temp + "#";
            continue;
          }
       }
       return temp;
    }
}
