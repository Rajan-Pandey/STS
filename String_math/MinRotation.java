/* Idea is to store strings in Two Linked Lists
1.First linkedlist will not be changed 
2.We will generate rotations of string by reading and removing element from front and adding it from back 
3.will increment count of rotation by 1 for each such operation and check if both queues are equal after each rotation
4.if both queues are equal then current count of rotation is our answer
*/
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
