import java.util.*;

public class stack
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n = sc.nextInt();

 int i =1;

Stack<Integer> s = new Stack<>();

String instruct = new String();
while(!((instruct = sc.nextLine()).equals("EXIT")))
{
String[] str = instruct.split("\\s");
if(str[0].equalsIgnoreCase("push"))
{
	if(i <= n)
	{
		int data = Integer.parseInt(str[1]);
		s.push(data);
		System.out.println(data + " inserted in stack");
		++i;
	}
	else if( i > n)
		System.out.println("Stack is full");
}

else if(str[0].equalsIgnoreCase("pop"))
{
	if(!(s.isEmpty())) 
	{
		int data = s.pop();
		--i;
		System.out.println(data + " deleted from stack");
	}
	else System.out.println("Stack is empty");
}
else if(str[0].equalsIgnoreCase("print"))
	{	if(s.isEmpty())
		{
		 System.out.println("Stack is empty");
		  break;
		}
		for(int a : s)
			System.out.print(a+" ");
		System.out.println();
	}
}
}
}
