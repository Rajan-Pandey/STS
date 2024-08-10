import java.util.*;

class Matrix_Zero
{
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter No. of rows and columns : " );
	int m = sc.nextInt();
	int n = sc.nextInt();
	int matrix[][] = new int[m][n];
	System.out.print("Enter Matrix Elements : ");
	for(int i=0; i<m; i++)
		for(int j =0; j<n; j++)
			matrix[i][j] = sc.nextInt();
	
	int[] row = new int[m];
	int[] col = new int[n];
	int count = 0;
	for(int i =0; i<m ; i++)
	{
		row[i] = 0;
		count = 0;
		for(int j =0; j<n; j++)
		{
			col[j] += matrix[i][j];
			count += matrix[i][j];
		}
		row[i] = count;
	}
	/*for(int i =0; i<m; i++)
		System.out.print(row[i] + " ");
	System.out.println();
	
	for(int i =0; i<n; i++)
		System.out.print(col[i] + " ");
	System.out.println();
	*/
	
	for(int i =0; i<m; i++)
	{
	if(row[i] == 0)
		continue;
		for(int j =0; j<n; j++)
		{
		if(col[j] == 0)
			continue;
		System.out.print(matrix[i][j] + " ");
		}
		System.out.println();
	}
	}
}

