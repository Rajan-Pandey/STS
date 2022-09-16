import java.util.*;

public class AllSubsequences
{

static ArrayList<String> al = new ArrayList<String>();
static ArrayList<String> al1 = new ArrayList<String>();
public static void main(String[] args)
{

//double start = System.currentTimeMillis();
Scanner sc = new Scanner(System.in);
String str = sc.next();
String str1 =sc.next();

printSubsequence(str,"");
printSubsequence1(str1,"");

Collections.sort(al, (a,b) -> b.length() - a.length());
Collections.sort(al1, (a,b) -> b.length() - a.length());
System.out.println(al);
System.out.println(al1);

for(String s : al)
{
	if(al.contains(s) && al1.contains(s))	
		System.out.println(s);
}

//double end = System.currentTimeMillis();

//System.out.print((end-start)/1000);
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
static  void printSubsequence1(String str , String ans)
{
if(str.length() == 0)	
	{
			al1.add(ans);
			return ;
	}
	 // We add adding 1st character in string
	printSubsequence1(str.substring(1), ans+str.charAt(0));
	// Not adding first character of the string
        // because the concept of subsequence either
        // character will present or not	
	printSubsequence1(str.substring(1), ans);
}
}
