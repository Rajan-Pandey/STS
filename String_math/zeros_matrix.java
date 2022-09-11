import java.util.*;

public class zeros_matrix
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
int m = sc.nextInt();
int n = sc.nextInt();

int[][] matrix = new int[m][n];

for(int i=0;i<m;i++)
{	
	for(int j=0;j<n;j++)
	{
		matrix[i][j] = sc.nextInt();
	}
}

int[] row = new int[m];
int[] col = new int[n];

int sum = 0;
int k = 0;

for(int i=0;i<m;i++)
{	
	for(int j=0;j<n;j++)
	{
		row[i] += matrix[i][j];
	}
}

for(int i=0;i<n;i++)
{	
	for(int j=0;j<m;j++)
	{
		sum += matrix[j][i];
	}
	col[k++] = sum;
	sum = 0;
}

/*for(int a : row)
	System.out.print(a + "  ");
System.out.println();

for(int a : col)
	System.out.print(a + "  ");
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



/*ArrayList<Integer> row = new ArrayList<>();
ArrayList<Integer> column = new ArrayList<>();
for(int i=0;i<n;i++)
{	
	for(int j=0;j<n;j++)
	{
		if(matrix[i][j] != 0)
			break;
		if(j == n-1 && matrix[i][j] == 0)
		 row.add(i);
	}
}
for(int i=0;i<n;i++)
	for(int j=0;j<n;j++)
	{
		if(matrix[j][i] != 0)
			break;
		if(j == n-1 && matrix[j][i] == 0 )
		 column.add(i);
	}

for(int i=0;i<n;i++)	
{	
	if(row.contains(i))
		continue;
	for(int j=0;j<n;j++)
	{
		if(column.contains(j))
			continue;
		System.out.print(matrix[i][j]);
	}
	System.out.println();

}
*/
//System.out.print(row + " " + column);
}
}
