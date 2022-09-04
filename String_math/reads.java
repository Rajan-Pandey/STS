import java.util.*;

public class reads
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<String> list = new ArrayList<String>();
String sb = "";
String str = null;
do
{
	str = sc.nextLine();
	sb = sb + str;
}
while(!str.equals(""));
String[] s = sb.split(" ");
for(int i=0; i<s.length;i++)
	if(list.contains(s[i]))
		continue;
	else list.add(s[i]);

for(String out : list) 
	System.out.print(out + " ");
}
}
