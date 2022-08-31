import java.util.*;

public class OddOccurence
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Size of Array : ");
int N = sc.nextInt();
int[] arr = new int[N];
System.out.print("Enter Array Elements : ");
for(int i=0;i<N;i++)
	arr[i] = sc.nextInt();
HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
ArrayList<Integer> list = new ArrayList<Integer>();
for(int a : arr)
{
	if(map.containsKey(a))
	{
		int val = map.get(a);
		map.put(a,val+1);
	}
	else map.put(a,1);
}
for(int a : arr)
{
	if(map.get(a) % 2 != 0 && !list.contains(a))
	{
		list.add(a);
		System.out.println(a);
	}
}
}
}
