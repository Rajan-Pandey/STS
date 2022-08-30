import java.util.*;

public class DistinctDiff
{
public static void main(String[] args)
{
int k = 4;
int count = 0;
int[] arr = {8,12,16,4,0,20};
HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
ArrayList<Integer> a = new ArrayList<Integer>();
for(int i=0;i<arr.length;i++)
	a.add(arr[i]);
for(int i=0;i<arr.length;i++)
	if(a.contains(arr[i]-k))
	{
		count++;
		map.put(arr[i],arr[i]-k);
	}	
System.out.println("Total distinct Pairs with given diff of " +k+ " are : " + count); 
for(HashMap.Entry m : map.entrySet())
	System.out.print("(" + m.getKey() + "," + m.getValue() + ")");
System.out.println();
}
}
