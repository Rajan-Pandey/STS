/*Given two bit sequences as strings, write a function to return the addition of the two sequences. Bit strings can be of different lengths also. For example, if string 1 is “1100011” and second string 2 is “10”, then the function should return “1100101”. */


import java.util.*;

public class P9
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String n1 = sc.next();
String n2 = sc.next();

int i = n1.length()-1;
int j = n2.length()-1;

StringBuilder ans = new StringBuilder();

int carry = 0;
while(i>=0 || j>=0 || carry > 0)
{
	if(i>=0)
		carry += n1.charAt(i--) - '0';
	if(j>=0)	
		carry += n2.charAt(j--) - '0';
	ans.append(carry%2);
	carry /= 2;
}

System.out.println(ans.reverse());
}
}
