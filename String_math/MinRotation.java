import java.util.*;

public class MinRotation
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
Queue<Character> q1 = new LinkedList<>();
Queue<Character> q2 = new LinkedList<>();

System.out.print("Input String : ");
String str = sc.next();

int rotations = 0;
int len = str.length();
int index = 0;

for(int i =0;i<str.length();i++)
{
	q1.add(str.charAt(i));
	q2.add(str.charAt(i));
}

while(index-- < len)
{
	char temp = q2.poll();
	q2.add(temp);
	++rotations;
	if(q1.equals(q2))
		break; 
}
System.out.println(rotations);
}
}
