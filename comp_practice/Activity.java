import java.util.*;

class pair 
//implements Comparable<pair>
{
int start;
int end;

pair(int start, int end)
{
this.start = start;
this.end = end;
}

/* public int compareTo(pair p1)
{
return this.end-p1.end;
}
*/
}

public class Activity
{
public int findActivityCount(int[] start, int[] end, int n)
{
int count = 1;
int j = 0;  // first activity is always selected hence count = 1 and j points to index of those activities that are selected
pair[] p = new pair[n];
for(int i=0;i<n;i++)
	p[i] = new pair(start[i], end[i]);
Arrays.sort(p,(a,b) ->  a.end - b.end);
System.out.println("::Possible sequence of activities are ::");
System.out.println("(" + p[j].start + "," + p[j].end +")"); 
for(int i=1;i<n;i++)
{
	if(p[i].start >= p[j].end)
	{
		System.out.println("(" + p[i].start + "," + p[i].end + ")");
		count++;
		j = i;
	}	
}
return count;
}
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no. of Activities : ");
int n = sc.nextInt();
int[] start = new int[n];
int[] end = new int[n];
System.out.print("Enter start time of activities : ");
for(int i=0;i<n;i++)
	start[i] = sc.nextInt();
System.out.print("Enter end time of activities : ");
for(int i=0;i<n;i++)
	end[i] = sc.nextInt();
Activity activity = new Activity();
System.out.println("Max no. of Activities Possible  are : " + activity.findActivityCount(start,end,n));
}

}
