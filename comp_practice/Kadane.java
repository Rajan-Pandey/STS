
/* Program to find maximum sum contigous sub array */

import java.util.*;

public class Kadane
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Input Size of Array : ");
int N = sc.nextInt();
int[] arr = new int[N];
System.out.print("Input elements of array (seperated by spaces) : ");
for(int i=0;i<N;i++)
	arr[i] = sc.nextInt();
System.out.println(maxSubArraySum(arr,N));
}

static int maxSubArraySum(int[] arr, int N)
{
int curr_max = arr[0];
int max_so_far = arr[0];
for(int i =0; i<N; i++)
{
	curr_max = Math.max(arr[i],curr_max+arr[i]);
	max_so_far = Math.max(max_so_far,curr_max);
}
return max_so_far;
}
}
