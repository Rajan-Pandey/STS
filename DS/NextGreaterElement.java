/*Given an array, print the Next Greater Element (NGE) for every element. 

    The Next greater Element for an element x is the first greater element on the right side of x in the array. Elements for which no greater element exist, consider the next greater element as -1. */

import java.util.*;

public class NextGreaterElement
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
long[] arr = new long[n];
long[] ans = new long[n];
Arrays.fill(ans,-1l);
for(int i =0; i<n; i++)
	arr[i] = sc.nextLong();

Stack<Integer> stack = new Stack<Integer>();


for(int i=0; i<n; i++)
{
if(stack.isEmpty())
	{	
	stack.push(i);
	continue;
	}
	while(!stack.isEmpty() && arr[i] > arr[stack.peek()])
	{
	 ans[stack.pop()] = arr[i];
	}
	stack.push(i);
}
for(long a : ans)
	System.out.print(a+ " ");
}
}
