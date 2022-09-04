
/*Idea is to store all characters of string into Queue 
1. Poll element from top and add it from end then print current state of queue
2. repeat step1 for K number of times, where K will iterate till it's value is equal to string length
*/

import java.util.*;

public class AllRotations
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
Queue<Character> q = new LinkedList<>();

System.out.print("Input String : ");
String str = sc.next();

int K = 0;

for(int i=0; i<str.length();i++)
	q.add(str.charAt(i));


while(K++ < str.length())
{
char temp = q.poll();
q.add(temp);
for(Character cg : q)
	System.out.print(cg);
 //System.out.println(q.toString());
System.out.println();
}
}
}
