import java.util.*;

public class duplicate
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Sentence: ");
String str = sc.nextLine();

String st[] = str.split("\\s+");
ArrayList<String>  set = new ArrayList<>();

for(int i =0; i<st.length; i++)
	if(!set.contains(st[i]))
	{
		set.add(st[i]);
		}
		
for(String s : set)	
	System.out.print(s + " ");
}
}
