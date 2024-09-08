import java.util.*;

class A
{
int a;
String b;

A(int a, String b)
{
this.a = a;
this.b = b;
}

public String toString()
{
	return this.a + "  " + this.b;
	}
}


public class comparator
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<A> list = new ArrayList<A>();
String tmp = sc.nextLine();
while(!(tmp.equals("THE END")))
{
String[] str = tmp.split("#");
list.add(new A(Integer.parseInt(str[0]), str[1]));
tmp = sc.nextLine();
}

Collections.sort(list, new Comparator<A>()
{
	public int compare(A a1, A a2)
	{
		if(a1.a > a2.a)
			return -1;
		return 1;	
		//return a1.b.compareTo(a2.b);
	}
});

for(A a1 : list)
	System.out.println(a1.toString());	
}
}
