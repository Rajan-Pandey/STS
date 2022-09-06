import java.util.*;

public class zeros_matrix
{
public static void main(String[] args)
{
int[][] matrix = { {0,2,0,3,0},
		   {0,0,0,0,0},
		   {0,5,0,6,0},
		   {0,8,0,9,0},
		   {0,0,0,0,0}};

int n = matrix.length;

ArrayList<Integer> row = new ArrayList<>();
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
System.out.print(row + " " + column);
}
}
