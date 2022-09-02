import java.util.*;

class PoliceThief
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

System.out.print("Input Array Size : ");
int n = sc.nextInt();


int count = 0;
char[] arr = new char[n];

System.out.print("Enter characters (T for Thief and P for Police) : ");
for(int i=0;i<n;i++)
	arr[i] = sc.next().charAt(0);

System.out.print("Enter Distance : ");
int k = sc.nextInt();
ArrayList<Integer> police = new ArrayList<Integer>();
ArrayList<Integer> thief = new ArrayList<Integer>();

for(int i=0; i<n; i++)
{
	if(arr[i] == 'P')
		police.add(i);
	else
		thief.add(i);
}
int p = 0, t = 0;
while(p<police.size() && t<thief.size())
{
	if(Math.abs(police.get(p) - thief.get(t)) <= k)
	{
		p++;
		t++;	
		count++;
	}
	else if(police.get(p) < thief.get(t))
			p++;
	else t++;
}
System.out.println(count);
}
}
