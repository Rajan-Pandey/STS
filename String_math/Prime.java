import java.util.*;

public class Prime
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter N : ");
int n = sc.nextInt();

boolean[] prime = new boolean[n+1];
Arrays.fill(prime,true);

for(int p =2 ;p*p <=n; p++)
{
	if(prime[p])
		{
			for(int i = p*p ; i<=n ; i += p)
				prime[i] = false;
		}
}

ArrayList<Integer> list = new ArrayList<Integer>();
for(int i =2; i<=n; i++)
	if(prime[i])
		list.add(i);
	
System.out.println("Prime numbers till " + n + " are ");
System.out.println(list); 
}
}
