import java.util.*;

public class BracketMatching
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int N =sc.nextInt();
sc.nextLine();
while(N-- >0)
{
String S = sc.nextLine();
Stack<Character> stack = new Stack<Character>();

boolean flag = false;
for(int i = 0; i<S.length(); i++)
{

char ch = S.charAt(i);
if(ch == '(' || ch == '[' || ch == '{' )
	stack.push(S.charAt(i));
else if(ch == ')' || ch == ']' || ch == '}')
	{
		if(!stack.isEmpty())
			{
				char temp = stack.peek();
				if((ch == ')' && temp == '(') || (ch == '}' && temp == '{') || (ch == ']' && temp == '['))
					stack.pop();
				else {
					flag = true;
					break;
				      }
			}
			else
		 	{
			flag = true;
			break;
			}
	}
}

if(flag == true || !stack.isEmpty())
	{
		int closing = 0, opening = 0;
		for(int i = 0; i<S.length(); i++)
		{		
			char ch  = S.charAt(i);
			if(ch == '(' || ch == '[' || ch == '{' )
				++opening;
			else if(ch == ')' || ch == ']' || ch == '}')
				++closing;
		}	
		if(opening > closing)
			System.out.println("TOO MANY OPENING");
		else if(opening < closing)
			System.out.println("TO MANY CLOSING");
		else System.out.println("MISMATCH");
	}
else System.out.println("VALID");
}
}
}
