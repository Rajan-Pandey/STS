/*Given a string S of length N, the task is to print the highest roman number possible by rearranging the characters of the given string, if the given string is a valid roman number. If found to be not possible, then print “Invalid”.
*/



import java.util.*;

public class Roman
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<Character> list = new ArrayList<>();
ArrayList<Character> num = new ArrayList<>();
list.add('I');
list.add('V');
list.add('X');
list.add('L');
list.add('C');
list.add('D');
list.add('M');
boolean flag = false;

String s = sc.next();
for(int i =0; i<s.length(); i++)
{
	if(!list.contains(s.charAt(i)))
	{
		flag = true;
		break; 
	}
	num.add(s.charAt(i));	
}

Collections.sort(num, new Comparator<Character>()
{
	public int compare(Character a, Character b)
	{
	int first = list.indexOf(a);
	int second = list.indexOf(b);
		return second - first;
	}
});

if(flag)
	System.out.println("InValid");
else
{
StringBuilder number = new StringBuilder();
for(char ch : num)
	number.append(ch);
System.out.println(number);
}
}
}
