
/*Find k’th character of decrypted string
Given an encoded string, where repetitions of substrings are represented as substring followed by count of substrings. For example, if encrypted string is “ab2cd2” and k=4 , so output will be ‘b’ because decrypted string is “ababcdcd” and 4th character is ‘b’. */

import java.util.*;

public class decrypted
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Decrypted String : ");
String decrypted = sc.nextLine();

System.out.print("Enter K : ");
int k =sc.nextInt();

String encrypted = new String();

String temp = "";
int freq = 0;

for(int i=0; i<decrypted.length();)
{
temp = "";
freq = 0;
while( i < decrypted.length() && Character.isLetter(decrypted.charAt(i)))
	temp = temp + decrypted.charAt(i++);

while(i< decrypted.length() && Character.isDigit(decrypted.charAt(i)))
	freq = freq*10 + Integer.parseInt(String.valueOf(decrypted.charAt(i++)));

while(freq-- > 0)
	encrypted += temp;
}
System.out.println(encrypted);
System.out.println(encrypted.charAt(k-1));
}
}
