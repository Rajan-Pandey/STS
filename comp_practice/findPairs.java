import java.util.*;

public class findPairs
{
public static void main(String[] args)
{
long startTime = System.nanoTime();
int[] arr1 = {1,2,3,7,5,4,2,4};
int[] arr2 = {0,7,4,3,2,1};
int key = 8;

ArrayList<Integer> h = new ArrayList<Integer>();
for(int i=0;i<arr1.length;i++)
	h.add(arr1[i]);

for(int i=0;i<arr2.length;i++)
	if(h.contains(key-arr2[i]))
		System.out.println(key-arr2[i] + " " + arr2[i]);
	for(int a : h)
		System.out.print(a+" ");
long endTime = System.nanoTime();
	System.out.println();
	System.out.println(endTime - startTime + " nanoseconds");
}
}
