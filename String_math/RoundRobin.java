/* No of matches in Round Robin tournament for N no. of teams using Matrix calculation , although for n teams total no. of matches = n*(n-1)/2 is mathematical solution as well;
for 4 teams L matrix will be formed as 
0 0 0 0 
1 0 0 0
1 1 0 0 
1 1 1 0

all those elements will be added which are not zero */


import java.util.*;

public class RoundRobin
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no. of teams : ");
int n = sc.nextInt();

int[][] d = new int[n][n];
int count = 0;
for(int[] row : d)
Arrays.fill(row,1);

//for(int i=1; i<n;i++)
//	d[i][0] = 1;

for(int i=0;i<n;i++)
  for(int j=0;j<n;j++)
	{
	 if(i<=j)
		d[i][j] = 0;
	}

for(int i=0;i<n;i++)
  for(int j=0;j<n;j++)
	count += d[i][j];

System.out.println("No.of Matches = " + count); 
}

}
