import java.util.*;

public class Eval
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String exp = sc.nextLine();

Stack<Integer> val = new Stack<Integer>();
Stack<String> op = new Stack<String>();
boolean digit = false;
for(int i =0; i< exp.length(); i++)
	{
		if(Character.isDigit(exp.charAt(i))) 
		{
			if(digit != false)
			{
			digit = true;
			int tmp = val.pop();
			val.push(tmp * 10 + Integer.parseInt("" + exp.charAt(i)));
			}
			else
			{
			digit = true;
			val.push(Integer.parseInt("" + exp.charAt(i)));
			}
		}			
		else
		{
			op.push(""+ exp.charAt(i));
			digit = false;
		}
	}
	while(!val.isEmpty())
		System.out.print(val.pop() + " ");
	System.out.println();
	while(!op.isEmpty())
		System.out.println(op.pop() + " ");
  }
}





