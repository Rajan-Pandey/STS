
//Let the input string be “i like this program very much”. The function should change the string to “much very program this like i”  


import java.util.*;

public class reverseWords
{
public static void main(String[] args)
{
Scanner sc  = new Scanner(System.in); 
String s = sc.nextLine();
String[] str = s.split("\\s+");   // Spliting String on one or multiple spaces
String result = new String();

for(int i=str.length-1; i>=0; i--)
	result  += str[i]+" ";
System.out.println(result);
}
}
