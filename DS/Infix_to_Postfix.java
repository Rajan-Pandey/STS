import java.util.*;

public class Infix_to_Postfix
{
	public static void main(String[] args)
	{
	//String str = "3*6+2";
	Scanner sc = new Scanner(System.in);
	String str = sc.nextLine();
	String post_fix = new String();
	Stack<Character> stack = new Stack<Character>();
	for(int i = 0; i<str.length(); i++)
	{
		if(Character.isLetterOrDigit(str.charAt(i)))
			post_fix += String.valueOf(str.charAt(i));
		else if((str.charAt(i) == '-') || (str.charAt(i) == '+') || (str.charAt(i) == '*') || (str.charAt(i) == '/') || (str.charAt(i) == '^'))
			{
				char temp = str.charAt(i);
				if(stack.isEmpty())
					stack.push(str.charAt(i));
				else if(Precedence(temp) <= Precedence(stack.peek()))
					{
					while(!(stack.isEmpty()) && (Precedence(temp) <= Precedence(stack.peek())))
						post_fix = post_fix + String.valueOf(stack.pop());
					stack.push(temp);	
					}
				else stack.push(temp);		
			}
		else if (str.charAt(i) == '(')
			stack.push('(');
		else if(str.charAt(i) == ')')
			{
				while(stack.peek() != '(')
					post_fix = post_fix + String.valueOf(stack.pop());
				stack.pop();
			}
			
	}
	while(!stack.isEmpty())
		post_fix = post_fix + stack.pop();
	System.out.println(post_fix);
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
				case '^' : return 3;								
			}
		return -1;
	}
}
