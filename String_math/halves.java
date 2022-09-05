import java.util.*;

public class halves
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String str = sc.nextLine();

int[] first = new int[26];
int[] second = new int[26];
int len = str.length();
boolean flag = true;

for(int i =0 , j=len-1 ; j>i; j-- , i++)
{
	first[str.charAt(i)-'a']++;
	second[str.charAt(j)-'a']++;	
}
for(int i=0;i<26;i++)
	{
		if(first[i] != second[i])	
			{
			flag = false;
			}
	}
	if(flag == false)
		System.out.println("Not equal");
	else
		System.out.println("Equal");
}
}
