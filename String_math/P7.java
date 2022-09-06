
/*Given a string of length n of lowercase alphabet characters, we need to count total number of distinct substrings of this string. */


import java.util.*;

public class P7
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String s1 = sc.nextLine();

HashSet<String> set = new HashSet<String>();

for(int i = 0;  i<s1.length(); i++)
{
	String substr = "";
	for(int j = i; j<s1.length(); j++)
	{
		substr += s1.charAt(j);
		set.add(substr);
	}
}
for(String temp : set)
	{
	System.out.println(temp);
	}
System.out.println(set.size() + 1);
}
}
