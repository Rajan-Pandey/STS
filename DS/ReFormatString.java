/*Given a string S that consists of only alphanumeric characters and dashes. The string is separated into N + 1 groups by N dashes. Also given an integer K. 

We want to reformat the string S, such that each group contains exactly K characters, except for the first group, which could be shorter than K but still must contain at least one character. Furthermore, there must be a dash inserted between two groups, and you should convert all lowercase letters to uppercase.

Return the reformatted string.

*/

import java.util.*;

public class ReFormatString
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String S  = sc.next();
System.out.print("Enter Digit : ");
int K = sc.nextInt();

StringBuilder sb = new StringBuilder();

int count = 0;

 for(int i = S.length()-1; i>=0; i--)
        {
            if(S.charAt(i) == '-')
                continue;
            if(count != 0 && (count % K == 0) )
                sb.append("-");
            sb.append(Character.toUpperCase(S.charAt(i)));
            count++;
        }
	System.out.println("Formated String : " + sb.reverse().toString());
}
}
