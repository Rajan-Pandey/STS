
/*Given a string, check if it is a rotation of a palindrome. For example your function should return true for “aab” as it is a rotation of “aba”. */


import java.util.*;

public class P11
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.next();

Queue<Character> q = new LinkedList<Character>();

for(int i=0; i<str.length(); i++)
	q.add(str.charAt(i));

String temp = "" + str;
int i = 1;
boolean flag = false;
while(!(q.isEmpty()))
{
	temp = temp + q.poll();
	if(isPalindrome(temp.substring(i++)))
	{	
		flag = true;
		break;
	}
}

	if(flag)
		System.out.println("Yes");
	else 	System.out.println("No");
}

public static boolean isPalindrome(String str)
{
	for(int i=0 , j= str.length()-1 ; i<j; i++ , j--)
		if(str.charAt(i) != str.charAt(j))
			return false;

	return true;
}

}
