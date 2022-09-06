import java.util.*;

public class reads
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<String> list = new ArrayList<String>();
char ch = '9';
int i = ch - '0';
int j = (int)ch;
System.out.println(i);
System.out.println(j);
String[] arr = {"A","a","b","B","BC","BA"};
Arrays.sort(arr,new Comparator<String>()
{
	public int compare(String a , String b)
	{
		return b.compareTo(a);
	}
}	
);

for(String no : arr)
	System.out.println(no);
/*String sb = "";
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
*/
}
}
