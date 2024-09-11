/*Given a string s consisting of lowercase Latin Letters. Return the first non-repeating character in s. If there is no non-repeating character, return '$'.
*/

import java.util.*;

public class NonRepeating
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
boolean flag = false;
String S = sc.next();

int[] count = new int[26];

for(int i =0; i< S.length(); i++)
	count[S.charAt(i) - 'a']++;
	
for(int i =0; i< S.length(); i++)
{
	if(count[S.charAt(i) - 'a'] == 1)
	{
		flag = true;
		System.out.println(S.charAt(i));
		break;
		}
}
if(!flag)
	System.out.println("$");
}

}
