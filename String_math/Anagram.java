import java.util.*;

class Pair
{ 
  String name;
 int index;

Pair(String name , int index)
{
this.name = name;
this.index = index;
}
}


public class Anagram
{
public static void main(String[] args)
{
ArrayList<String> list = new ArrayList<String>();
Scanner sc = new Scanner(System.in);
String temp = sc.next();
while(!temp.equals("-1"))
{
	list.add(temp);
	temp = sc.next();	 
}

int len = list.size();
Pair[] pair = new Pair[len];
for(int i= 0 ; i< len; i++)
{
	String t = list.get(i);
	char[] tp = t.toCharArray();
	Arrays.sort(tp);
	String newWord = new String(tp);
	pair[i] = new Pair(newWord , i);	
}

	Arrays.sort(pair,(a,b) -> a.name.compareTo(b.name));
	/*for(int i =0; i<len ; i++)
		System.out.println(pair[i].name +  " " + pair[i].index);
	
	for(int i =0; i<len-1; i++)
		for(int j = i+1; j<len; j++)
		{
			if(pair[i].name.equals(pair[j].name))
				{
				System.out.println(list.get(pair[i].index) + " " + list.get(pair[j].index));
				}			
		}
		*/
		for(int i = 0; i<len; i++)
			System.out.println(list.get(pair[i].index));
		

}
}
