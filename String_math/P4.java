import java.util.*;

public class P4
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of Array : ");
int n = sc.nextInt();
//String[] str = {"for", "", "", "", "geeks",  "ide", "", "practice", "" ,  "", "quiz", "", ""};

ArrayList<String> list= new ArrayList<String>();
System.out.print("Enter Array Elements : ");
for(int i =0; i<n+1; i++)
	list.add(sc.nextLine());

System.out.print("Enter String : ");
String key = sc.next();

System.out.println(list.indexOf(key));
}
}	

