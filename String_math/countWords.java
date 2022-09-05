
/*Given an array of words and a string, we need to count all words that are present in given string.
Input : words[] = { "welcome", "to", "geeks", "portal"}
            str = "geeksforgeeks is a computer science portal for geeks."
Output :  2
Two words "portal" and "geeks" is present in str.


Input : words[] = {"Save", "Water", "Save", "Yourself"}
        str     = "Save"
Output :1
*/

import java.util.*;

public class countWords
{
public static void main(String[] args)
{
Scanner sc  = new Scanner(System.in); 
System.out.print("Enter String : ");
String str = sc.nextLine();

String[] string = str.split("\\s+");

//ArrayList<String> list = new ArrayList<String>();
int count = 0;

System.out.print("Enter size of array : ");
int size = sc.nextInt();
sc.nextLine();
ArrayList<String> arr = new ArrayList<>(size);
System.out.print("Enter array of words : ");

for(int i=0; i<size; i++)
{
	String temp = sc.nextLine();
	if(arr.contains(temp))
		continue;
	else
		arr.add(temp);
}

/* for(String s : list)
	if(str.contains(s))
		++count;
*/

for(String s : arr)
	for(int j=0; j<string.length;j++)
		if(s.equals(string[j]))
		{	
			++count;
			 break;
		}

System.out.println(count);
}
}
