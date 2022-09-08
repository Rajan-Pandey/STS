import java.util.*;


public class Prefix_to_Infix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

Stack<String> stack = new Stack<String>();

for(int i = str.length() -1 ; i>=0; i--)
{
char temp = str.charAt(i);
if(Character.isLetterOrDigit(temp))
	stack.push(String.valueOf(str.charAt(i)));
else if(temp == '-' || temp == '+' || temp == '*' || temp == '/' || temp == '^')
{
	String t = "(" + stack.pop() + temp + stack.pop() + ")";
	stack.push(t);
	
}
}
System.out.print(stack.pop());
}
}
