import java.util.*;

public class rotation
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s1 = sc.nextLine();
String s2 = sc.nextLine();

/*

Both solutions are working , using Queue and temp String
String temp = s1 + s1;

if(temp.contains(s2))
	System.out.println("True");
else System.out.println("False");


Using Queue
*/

Queue<Character> q1 = new LinkedList<>();
for(int i =0;i<s1.length();i++)	
	q1.add(s1.charAt(i));

Queue<Character> q2 = new LinkedList<>();
for(int i =0;i<s2.length();i++)	
	q2.add(s2.charAt(i));

int len = s2.length();
boolean flag = false;
while(len>0)
{
--len;
char ch = q2.poll();
q2.add(ch);
if(q1.equals(q2))
{
	flag = true;
	break;
}
}
System.out.println(flag);

}
}
