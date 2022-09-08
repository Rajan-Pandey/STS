import java.util.*;

public class evaluate_infix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String exp = sc.nextLine();

Stack<Character> operator = new Stack<Character>();
Stack<Integer> operand = new Stack<Integer>();

for(int i = 0;i<exp.length(); i++)
{
char temp = exp.charAt(i);
if(Character.isDigit(temp))
	operand.push(Integer.parseInt(String.valueOf(temp)));
else if(temp == '(')
	operator.push(temp);
else if(temp == ')')
	{
	while(operator.peek() != '(')
	{
		int op1 = operand.pop();
		int op2 = operand.pop();
		char ch = operator.pop();
		int res = Operate(op1,op2,ch);
		operand.push(res);
		System.out.println(op1 + " " + op2 + " " + ch + " " + res);
	}
	operator.pop();
	}
else if(temp == '-' || temp == '+' || temp == '*' || temp == '/' || temp == '^')
{ 
if(!operator.isEmpty() && Precedence(temp) <= Precedence(operator.peek()))
	{
	while(!operator.isEmpty() && Precedence(temp) <= Precedence(operator.peek()))
	{
		int op1 = operand.pop();
		int op2 = operand.pop();
		char ch = operator.pop();
		int res = Operate(op1,op2,ch);
		operand.push(res);
		System.out.println(op1 + " " + op2 + " " + ch + " "  + res);
	}
	operator.push(temp);
	}
else operator.push(temp);
}
}
while(!operator.isEmpty())
{
operand.push(Operate(operand.pop(),operand.pop(),operator.pop()));
}

System.out.println(operand.pop());
}

static int Operate(int op1,int op2, char ch)
{
	 switch(ch)
	{
		case '-' :
			return op2-op1;
		case '+' :
			return op1+op2;
		case '*' :
			return op1*op2;
		case '/' :
			return op2/op1;
		case '^' :
			return op1^op2;
	}
	return -1;
}
static int Precedence(char ch)
{
	switch(ch)
	{
		case '-' :
		case '+' :
			return 1;
		case '/' :
		case '*' :
			return 2;
		case '^' :
			return 3;
	}
	return -1;
}
}
