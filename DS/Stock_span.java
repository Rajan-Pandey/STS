/*The stock span problem is a financial problem where we have a series of n daily price quotes for a stock and we need to calculate the span of stocks price for all n days. 
The span Si of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the current day is less than or equal to its price on the given day.
For example, if an array of 7 days prices is given as {100, 80, 60, 70, 60, 75, 85}, then the span values for corresponding 7 days are {1, 1, 1, 2, 1, 4, 6}.
*/
import java.util.*;


class Stock_span
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter number of days : ");        
            int n =sc.nextInt();
            int a[] = new int[n];
            
            int i = 0;
	    System.out.println("Enter stock prices : ");
            for(i = 0; i < n; i++)
              a[i] = sc.nextInt();
              
            int[] s = new Solution().calculateSpan(a, n);
            
            for(i = 0; i < n; i++)
            {
                System.out.print(s[i] + " ");
            }
            
            System.out.println();
    }
    
    
    
}


class Solution
{
    //Function to calculate the span of stocks price for all n days.
    public static int[] calculateSpan(int price[], int n)
    {
        int[] res = new int[n];
        Arrays.fill(res,1);
        Stack<Integer> stack = new Stack<Integer>();

        for(int i = 0 ; i<n; i++)
        {
            if(stack.isEmpty())
            {
                stack.push(i);
                continue;   
            }
            while(!stack.isEmpty() && (price[stack.peek()] <= price[i]))
            {
                res[i]  += res[stack.pop()];
            }
            stack.push(i);
        }
        return res;
    }
    
}
