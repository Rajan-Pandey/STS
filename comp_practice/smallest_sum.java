/*Given an array arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the minimum sum and return its sum.

Example 1:

Input: 
arr[] = {3,-4, 2,-3,-1, 7,-5}
Output: -6
Explanation: sub-array which has smallest 
sum among all the sub-array is {-4,2,-3,-1} = -6
*/

import java.util.*;

class smallest_sum
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
            int n =sc.nextInt();
            int arr[] = new int[n];
            
            for(int i = 0; i < n; i++)
             arr[i] = sc.nextInt();
             
           System.out.println(new Solution().smallestSumSubarray(arr, n)); 
    }
}




class Solution
{
    static int smallestSumSubarray(int a[], int size)
    {
        // your code here
        int curr_min = a[0];
        int temp = a[0];
        for(int i = 1; i<size; i++)
        {
             temp = Math.min(a[i], temp+a[i]);
            curr_min = Math.min(temp, curr_min);
        }
        return curr_min;
    }
}
