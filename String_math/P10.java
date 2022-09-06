/*Given a string s we have to find the lexicographical maximum substring of a string

Input : s = "ababaa"
Output : babaa
Explanation : "babaa" is the maximum lexicographic substring formed from this string

Input : s = "asdfaa"
Output : sdfaa
*/




import java.util.*;

public class P10
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = sc.next();

char[] str = s.toCharArray();
Arrays.sort(str);

//for(char ch : str)
//System.out.println(ch);
char maxchar = str[str.length-1];

ArrayList<Integer> list = new ArrayList<>();

for(int i =0; i<s.length(); i++)
	if(s.charAt(i) == maxchar)
		list.add(i);

//System.out.println(list);

String res = "";

int k = 0;

while(k < list.size())
{
	if(s.substring(list.get(k)).compareTo(res) > 0)
		res = s.substring(list.get(k));
	++k;
}

System.out.println(res);

}
}
