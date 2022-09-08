import java.util.*;


public class Postfix_to_Infix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

Stack<String> stack = new Stack<String>();

for(int i = 0 ; i<= str.length()-1; i++)
{
char temp = str.charAt(i);
if(Character.isLetterOrDigit(temp))
	stack.push(String.valueOf(str.charAt(i)));
else if(temp == '-' || temp == '+' || temp == '*' || temp == '/' || temp == '^')
{
	String op1 = stack.pop();
        String op2 = stack.pop();
	String t = "(" + op2 + temp + op1 + ")";
	stack.push(t);
	
}
}
System.out.println(stack.pop());
}
}
