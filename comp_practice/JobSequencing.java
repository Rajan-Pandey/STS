import java.util.*;

class JobSequencing
{
static class Job 
{
  int deadline, profit;

Job( int deadline, int profit)
{
this.deadline = deadline;
this.profit = profit;
}
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of Jobs : ");
int n = sc.nextInt();
int[] deadline = new int[n];
int[] profit = new int[n];

int max = 0;
System.out.print("Enter deadline of Jobs : ");
for(int i=0;i<n;i++)
	{
	deadline[i] = sc.nextInt();
	if(deadline[i] > max)
	max = deadline[i];
	}
System.out.print("Enter profit of Jobs : ");
for(int i=0;i<n;i++)
	profit[i] = sc.nextInt();

int[] res = getResult(deadline,profit,n,max);
System.out.println(res[0] + " " + res[1]);
}

 static int[] getResult(int[] deadline, int[] profit, int n, int max)
{
ArrayList<Job> J = new ArrayList<Job>();
for(int i=0;i<n;i++)
	J.add(new Job(deadline[i] , profit[i]));

Collections.sort(J,(a,b)-> { return b.profit - a.profit; });


boolean[] slot = new boolean[max];
Arrays.fill(slot,false);

int count = 0, total = 0;
for(int i=0;i<n;i++)
 {
	for(int j=Math.min(n-1,J.get(i).deadline-1); j>=0;j--)
	{
		if(slot[j] == false)
		{	
			count++;
			total += J.get(i).profit;
			slot[j] = true;
			break;
		}	
	}	
}
	int[] res = {count , total};

return	res; 
}
}
