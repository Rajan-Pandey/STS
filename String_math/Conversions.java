public class Conversions
{
public static void main(String[] args)
{
float f = 12.123f;
int k = 67;
String s = "ABCD1234";
String complex = "12+-45i";
String[] str = complex.split("\\+");
int digit = 0;
int alphabet = 0;
String s1 = Float.toString(f);
String s2 = Integer.toString(k);
char ch = (char)k;
System.out.println(s1 + " " + s2);
System.out.println(ch);
//System.out.println(octal);
for(int i=0; i<s.length();i++)
{	
	/* if(Character.isDigit(s.charAt(i)))
		++digit;	
	
	else if(Character.isAlphabetic(s.charAt(i)))
	 	++alphabet;
	*/
	if(Character.isLetterOrDigit(s.charAt(i)))
		++digit;
}
System.out.println("Digit_count : " + digit);
//System.out.println("Letter_count : " + alphabet);
for(int i=0; i<str.length; i++)
	System.out.print(str[i]+ " " + i + " ");
}
}
