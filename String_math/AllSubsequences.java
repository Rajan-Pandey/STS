import java.util.*;

public class AllSubsequences
{

static ArrayList<String> al = new ArrayList<String>();
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.next();

printSubsequence(str,"");
System.out.println(al);
}


static  void printSubsequence(String str , String ans)
{
if(str.length() == 0)	
	{
			al.add(ans);
			return ;
	}
	 // We add adding 1st character in string
	printSubsequence(str.substring(1), ans+str.charAt(0));
	// Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not	
	printSubsequence(str.substring(1), ans);
}
}
