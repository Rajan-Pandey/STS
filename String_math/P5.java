import java.util.*;

public class P5
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String string = sc.nextLine();

System.out.print("Enter Pattern : ");
String pattern = sc.nextLine();

int len = string.length();
int len2 = pattern.length();

int index = 0;
int count = 0;
while((index + len2) <= len)
{
	index = string.indexOf(pattern,index);
	count++;
	index++;
}


System.out.println(count);
}
}
