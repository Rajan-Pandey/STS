//check if expression has redundant braces

import java.util.*;

public class braces
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();
Stack<Character> stack = new Stack<Character>();
boolean flag = false;
for(int i =0; i<s.length(); i++)
  {
  char ch = s.charAt(i);
	if(ch == ')')
	{
		char top = stack.peek();
		if(top == '(')
		{
			flag = true;
			break;
		}
		while(top != '(')
		{	top = stack.peek();
			stack.pop();
			}
	}
	else
	stack.push(ch);
   }
 if(flag) 
 	System.out.println("Yes");
 else
 	System.out.println("No");
}

}
