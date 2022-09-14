/* Given a matrix of N * M. Find the maximum path sum in matrix. The maximum path is sum of all elements from first row to last row where you are allowed to move only down or diagonally to left or right. You can start from any element in first row.

Examples: 

Input : mat[][] = 10 10  2  0 20  4
                   1  0  0 30  2  5
                   0 10  4  0  2  0
                   1  0  2 20  0  4
Output : 74
The maximum sum path is 20-30-4-20.

Input : mat[][] = 1 2 3
                  9 8 7
                  4 5 6
Output : 17
The maximum sum path is 3-8-6.
*/

import java.util.*;

public class Max_Path_Sum
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no. of rows and columns : ");
int m = sc.nextInt();
int n = sc.nextInt();

int[][] arr = new int[m][n];

System.out.print("Enter matrix elements : ");

for(int i =0; i<m; i++)
	for(int j =0; j<n; j++)
		arr[i][j] = sc.nextInt();
		
for(int i =1; i<m; i++)
	{
	for(int j =0; j<n; j++)
				{
						if( j > 0 && j < n-1 ) 
							arr[i][j]  += Math.max(arr[i-1][j],Math.max(arr[i-1][j-1], arr[i-1][j+1]));
						else if(j == 0)
							arr[i][j] += Math.max(arr[i-1][j], arr[i-1][j+1]);
						else
						arr[i][j] += Math.max(arr[i-1][j-1], arr[i-1][j]);
				}
	}
	
	int res = 0;
	for(int i =0; i<n; i++)
	{
		if(res < arr[m-1][i])
			res = arr[m-1][i];
	}
	
	System.out.println("Max sum path is  : " + res);

}
}
