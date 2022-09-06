

/*Given a binary string (consists of only 0 and 1). If there is “100” as a sub-string in the string, then we can delete this sub-string. The task is to find the length of longest sub-string which can be make removed.

Input  : str = "1011100000100"
Output : 6
// Sub-strings present in str that can be make removed 
// 101{110000}0{100}. First sub-string 110000-->100-->null,
// length is = 6. Second sub-string 100-->null, length is = 3

*/



import java.util.*;

public class P8
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String s1 = sc.nextLine();

ArrayList<Character> list = new ArrayList<Character>();
int max_len = 0;
int prev_index = 0;
int first = 0;
int curr_count = 0;
for(int i=0; i<s1.length(); i++)
{
	
	list.add(s1.charAt(i));
		if(list.size() >=3 && (list.get(list.size()-3) == '1' && list.get(list.size()-2) == '0' && list.get(list.size()-1) == '0'))
		{
				list.remove(list.size()-3);
				list.remove(list.size()-2);
				list.remove(list.size()-1);
				if(first == 0)
				{
				++first;
				prev_index = i;
				curr_count = 3;
				}
				else if(i - prev_index <= 3)
				{
					prev_index = i;
					curr_count += 3;
				}
				else 
				{
					prev_index = i;
					curr_count = 3;
				}		
		}
		max_len = Math.max(curr_count,max_len);	
}
System.out.println(list);
//System.out.println(s1.length() - list.size());
System.out.println("Length of longest removeable substring : " + max_len);
}
}
