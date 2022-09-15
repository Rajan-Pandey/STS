import java.util.*;

public class Matrix_sort
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no of rows and columns : ");
int m = sc.nextInt();
int n = sc.nextInt();

int[][] arr = new int[m][n];
for(int i = 0; i<m ; i++)
	for(int j =0; j<n; j++)
		arr[i][j] = sc.nextInt();

for(int i =0; i<m;i++)
	Arrays.sort(arr[i]);   //Sort rows of matrix

for(int i =0; i<m; i++)     //Gettting transpose of matrix
	for(int j = i+1; j<n; j++)
	{
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}

for(int i =0; i<m;i++)  // Sort rows of matrix
	Arrays.sort(arr[i]);

for(int i =0; i<m; i++)    // Getting transpose of matrix
	for(int j = i+1; j<n; j++)
	{
		int temp = arr[i][j];
		arr[i][j] = arr[j][i];
		arr[j][i] = temp;
	}


for(int i = 0; i<m ; i++)
	{
	for(int j =0; j<n; j++)
		System.out.print(arr[i][j] + " ");
	System.out.println();
	}




}
}
