/*Given a stream of characters and we have to find first non repeating character each time a character is inserted to the stream. 
# represent no non-repeating character
*/

import java.util.*;

public class NonRepeat
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
Queue<Character> q = new LinkedList<Character>();
int[] count = new int[26];
StringBuilder sb = new StringBuilder();

for(int i =0; i< s.length(); i++)
{
	char ch = s.charAt(i);
	q.add(ch);
	count[ch-'a']++;
	while(!q.isEmpty())
	{
		if(count[q.peek()-'a'] > 1)
			q.poll();
		else
		{
		sb.append(q.peek());
		break;
		}		
	}
	if(q.isEmpty())
		sb.append("#");
}
	System.out.println(sb);
}
}
