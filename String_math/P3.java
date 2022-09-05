/* Sorting array of strings (or words) 

Given an array of strings, print them in alphabetical (dictionary) order. If there are duplicates in input array, we need to print them only once.
*/


import java.util.*;

public class P3
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String str = sc.nextLine();
String[] array = str.split("\\s+");
List<String> list = new ArrayList<>();

for(String temp : array)
{
if(!list.contains(temp))
	list.add(temp);
} 
PriorityQueue<String> pq = new PriorityQueue<String>();

for(String s : list)
		pq.add(s+" ");

while(!pq.isEmpty())
	System.out.print(pq.poll());
System.out.println();

}




}
