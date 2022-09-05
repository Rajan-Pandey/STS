
/*Given n and k, print a string that has n characters. The string should have exactly k distinct characters and no adjacent positions.
	Input  : n = 5, k = 3 
Output :  abcab
Explanation: 3 distinct character a, b, c
and n length string. 
*/

import java.util.*;

public class P1
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter length : ");
int n = sc.nextInt();
System.out.print("Enter distinct characters : ");
int k = sc.nextInt();

String s = new String();
char ch = 'a';
char temp = ch;
while(k-- > 0)
{
	s = s+Character.toString(ch);
	++ch;
	--n;
}

while(n-- > 0)
	s = s+Character.toString(temp++);

System.out.println(s);
}
}
