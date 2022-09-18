import java.util.*;

public class Spaces
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();

s = s.trim();

//System.out.println(s.replaceAll("\\s+"," ").trim());


String[] temp = s.split("\\s+");

for(String str : temp)
	System.out.print(str);

StringBuilder sb = new StringBuilder();

sb.append(temp[0]);

for(int i = 1 ;i<temp.length; i++)
	{
		if(temp[i].equals("."))
			sb.append(temp[i]);
		else 	sb.append(" " + temp[i]);
	}
System.out.println();
System.out.print(sb);


}
}

