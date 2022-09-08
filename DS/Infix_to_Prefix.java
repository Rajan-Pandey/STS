import java.util.*;

public class Infix_to_Prefix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

Stack<Character> stack = new Stack<>();
int n = str.length()-1;

StringBuilder prefix = new StringBuilder();

for(int i = n; i>=0; i--)
{
if(Character.isLetterOrDigit(str.charAt(i)))
	prefix.append(""+str.charAt(i));
else if(str.charAt(i) == ')')
	stack.push(')');
else if(str.charAt(i) == '(')
	{
	while(stack.peek() != ')')
		prefix.append(stack.pop());
	stack.pop();	
	}
else if(str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/' || str.charAt(i) == '^')
{
	char temp = str.charAt(i);
	if(stack.isEmpty())
		stack.push(temp);
	else if(Precedence(temp) < Precedence(stack.peek()))
	{
	while(!stack.isEmpty() && (Precedence(temp) < Precedence(stack.peek())))
		{
			prefix.append(stack.pop());
		}
	
		stack.push(temp);	
	}
	else if(!stack.isEmpty() && temp == '^')
	{
		while(!stack.isEmpty() && (Precedence(temp) == Precedence(stack.peek())))
		{
			prefix.append(stack.pop());
						
		}	
	stack.push(temp);
	}
	else stack.push(temp);
}
}
while(!stack.isEmpty())
	prefix.append(stack.pop());

System.out.println(prefix.reverse());
}

public static int Precedence(char ch)
{
switch(ch)
{
case '-' :
case '+' :
	return 1;
case '*' :
case '/' :
	return 2;
case '^' :
	return 3;

}
return -1;
}
}

