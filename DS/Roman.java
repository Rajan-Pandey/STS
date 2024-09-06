//Program to Convert Roman Numbers to Integer
import java.util.*;

public class Roman
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String roman = sc.next();
HashMap<Character,Integer> map = new HashMap<>();

map.put('I',1);
map.put('V',5);
map.put('X',10);
map.put('L',50);
map.put('C',100);
map.put('D',500);
map.put('M',1000);

int sum =0;
for(int i =0; i<roman.length(); i++)
{
	if( i+1 < roman.length() && map.get(roman.charAt(i)) < map.get(roman.charAt(i+1)))
		sum -= map.get(roman.charAt(i));
	else 
		sum += map.get(roman.charAt(i));
}

System.out.println(roman + " : " + sum);

}
}
