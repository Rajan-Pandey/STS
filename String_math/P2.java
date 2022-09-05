/* Sort String in Increasing order of length of words */

import java.util.*;

public class P2
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String str = sc.nextLine();

List<String> list  = Arrays.asList(str.split("\\s+"));   //Storing words in list by splitting string at whitespaces

Collections.sort(list,(a,b) -> a.length() - b.length());  //Sorting using lambda expressions in increasing order based on length of words
for(String s : list)
	System.out.print(s + " ");

System.out.println();
}
}
