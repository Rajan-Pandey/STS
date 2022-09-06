
/*Given two strings in lowercase, find the longest string whose permutations are subsequences of given two strings. The output longest string must be sorted.

Input  :  str1 = "pink", str2 = "kite"
Output : "ik" 
The string "ik" is the longest sorted string 
whose one permutation "ik" is subsequence of
"pink" and another permutation "ki" is 
subsequence of "kite". 

Input  : str1 = "working", str2 = "women"
Output : "now"

Input  : str1 = "geeks" , str2 = "cake"
Output : "ek"

Input  : str1 = "aaaa" , str2 = "baba"
Output : "aa"

*/


import java.util.*;

public class P6
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter first String : ");
String s1 = sc.nextLine();

System.out.print("Enter second String : ");
String s2 = sc.nextLine();

int[] f = new int[26];
int[] s = new int[26];

for(int i=0;i<s1.length(); i++)
	f[s1.charAt(i) - 'a']++;

for(int i=0;i<s2.length(); i++)
	s[s2.charAt(i) - 'a']++;

String temp = new String();
for(int i=0; i<26; i++)
{
	int val = Math.min(f[i],s[i]);
	while(val-- > 0)	
		temp += (char)('a'+i);
}

System.out.println(temp);
}
}
