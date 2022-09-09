/*A celebrity is a person who is known to all but does not know anyone at a party. If you go to a party of N people, find if there is a celebrity in the party or not.
A square NxN matrix M[][] is used to represent people at the party such that if an element of row i and column j  is set to 1 it means ith person knows jth person. Here M[i][i] will always be 0.
Input:
N = 3
M[][] = {{0 1 0},
         {0 0 0}, 
         {0 1 0}}
Output: 1
Explanation: 0th and 2nd person both
know 1. Therefore, 1 is the celebrity.
*/

import java.util.*; 

class celebrity{
    public static void main(String args[]){ 
        Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            int M[][] = new int[N][N];
            for(int i=0; i<N; i++)
            {
                for(int j=0; j<N; j++)
                {
                    M[i][j] = sc.nextInt();
                }
            }
            System.out.println(new Solution().celebrity(M,N));
    } 
} 
class Solution
{ 
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int M[][], int n)
    {
    	// code here 
    	int[] knows = new int[n];
        int[] known = new int[n];
        Arrays.fill(knows,0);
        Arrays.fill(known,0);
        for(int i =0; i<n; i++)
        {
            for(int j = 0; j<n; j++)
            {
                if(M[i][j] == 1)
                    {
                        knows[i] = 1;
                        known[j] += 1;
                    }
            }
        }
        for(int i =0; i<n; i++)
            {
                if(knows[i] == 0 && known[i] ==  n-1)
                    return i;
            }
        return -1;
    }
}
