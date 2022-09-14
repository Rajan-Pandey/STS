import java.util.*;

public class Spiral
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no of rows and column : ");
int row = sc.nextInt();
int col = sc.nextInt();

int[][] arr = new int[row][col];

for(int i =0; i<row; i++)
	for(int j=0; j<col; j++)
		arr[i][j] = sc.nextInt();

printSpiral(arr,0,0,row-1,col-1);
}

static void printSpiral(int[][] arr, int rowstart, int colstart , int rowend, int colend)
{
if(rowstart > rowend || colstart > colend)
	return;

for(int i = colstart ; i<=colend; i++)
	System.out.print(arr[rowstart][i] + " ");
for(int j = rowstart+1; j<=rowend; j++)
	System.out.print(arr[j][colend] + " ");
if(rowend != rowstart)
for(int i = colend-1; i>=colstart; i--)
	System.out.print(arr[rowend][i] + " ");

if(colend != colstart)
for(int j = rowend-1; j>rowstart; j--)
	System.out.print(arr[j][colstart] + " ");

printSpiral(arr,rowstart+1, colstart+1, rowend-1,colend-1);
}
}


