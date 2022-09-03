/* Given an array arr[], find the lexicographically smallest array that can be obtained after performing at maximum of k consecutive swaps. */


import java.util.*;

class SmallestArray
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Input size of array : ");
int n = sc.nextInt();
int[] arr = new int[n];

System.out.print("Input elements of array : ");
for(int i =0;i<n;i++)
	arr[i] = sc.nextInt();

System.out.print("Input no of swaps : ");
	int k = sc.nextInt();

HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

for(int i = 0; i<n; i++)
   {
	pq.add(arr[i]);
	map.put(arr[i],i);
   }
int j = 0;
while(k > 0)
{
int min = pq.poll();
int index = map.get(min);
if(index <= k)
{
	for(int ii = index; ii > 0; ii--)
		arr[ii] = arr[ii-1];
	arr[j++] = min;
	k = k-index;
}
}
for(int a : arr)
	System.out.print(a + " ");
}
}
