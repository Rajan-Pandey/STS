/*Given a matrix of characters. Find length of the longest path from a given character, such that all characters in the path are consecutive to each other, i.e., every character in path is next to previous in alphabetical order. It is allowed to move in all 8 directions from a cell.

Input: mat[][] = { {a, c, d},
                   {h, b, e},
                   {i, g, f}}
      Starting Point = 'e'

Output: 5
If starting point is 'e', then longest path with consecutive 
characters is "e f g h i".

*/




import java.util.*;

public class DFS_IMP
{

static int[] row = {-1,-1,-1,0,0,1,1,1};
static int[] col = {-1,0,1,-1,1,-1,0,1};


public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter no. of rows and columns of matrix : ");
int m = sc.nextInt();
int n = sc.nextInt();

char[][] matrix = new char[m][n];


int[][] dfs  = new int[m][n];

for(int i=0; i<m; i++)
	Arrays.fill(dfs[i],-1);

int ans = 0;

System.out.print("Enter characters of matrix : ");
for(int i =0; i<m; i++)
	for(int j =0; j<n; j++)
		matrix[i][j] = sc.next().charAt(0);


/*for(int i =0; i<m; i++)
	for(int j =0; j<n; j++)
		System.out.print(matrix[i][j] + " ");
*/
System.out.print("Enter starting char : ");
	char ch = sc.next().charAt(0);

for(int i =0; i<m; i++)
	for(int j=0; j<n; j++)
	{
		if(matrix[i][j] == ch)
		{
			for(int k=0; k<8; k++)
				ans = Math.max(ans, 1 + DFS(matrix,i+row[k],j+col[k],m,n,ch,dfs));
		}
	}

for(int i =0; i<m; i++)
	for(int j =0; j<n; j++)
		System.out.print(dfs[i][j] + " ");
		
	System.out.println("Longest path is  : " + ans);
}

static int DFS(char[][] matrix , int i ,int j , int m, int n, char ch,int[][] dfs)
{
	if(!isValid(i,j,m,n)  || !isAdjacent(matrix[i][j], ch))
		return 0;
	if(dfs[i][j] != -1)
		return dfs[i][j];

	int ans = 0;
	for(int k = 0; k<8; k++)
	 ans = Math.max(ans, 1 + DFS(matrix,i+row[k],j+col[k],m,n,matrix[i][j],dfs));

	return dfs[i][j] = ans;
} 

static boolean isValid( int i , int j, int m, int n)
{
	if((i >=0 && i <= m-1) && (j>=0 && j<=n-1)) 
		return true;
	return false;
}

static boolean isAdjacent(char ch1, char ch)
{
	if(ch1 - ch == 1)
		return true;	
	return false;
}

}





