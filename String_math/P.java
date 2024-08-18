import java.util.*;

public class P
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

List<String> list = new ArrayList<>();
for(int i =0; i<str.length(); i++)
{
list.add(str.substring(i,str.length()));
}

Collections.sort(list);
for(String temp : list)
	System.out.println(temp);

System.out.println("Maximum lexicographic substring formed from " + str  + " is " + list.get(list.size()-1));
}
}
 
