/*CDAC has decided to create a maze, next to it's library, so that only intelligent people can go into the library. As is typical of mazes, this one too has several dead ends and only one correct start and end point. You have to write a program to navigate this maze and enter the library.


Your starting point in the maze is marked by the character '#' and the entrance to the library (i.e., end point of the maze) is marked by the character '@', i.e. your program must start from
'#' and end at '@'.


The maze is composed of a rectangular array of cells. Apart from the start (#) and end (@) cells, maze contains solid cells and empty cells. A valid path never passes via a solid cell. The solid cells are marked by 0s and empty cells are marked by 1s. Once on a cell, you can only move to any one of the neighbouring four (i.e., north, east, west, south) cells.


Note: Assume that no path will ever cross itself, i.e., there will be no loops in any path.
*/
import java.util.*;


class Point
{
int row;
int col;
int val;

Point(int row, int col, int val)
{
	this.row = row;
	this.col = col;
	this.val = val;
}
}

public class Maze
{
public static void main(String[] args)
{
   Scanner sc = new Scanner(System.in);
   int n = sc.nextInt();
   int m = sc.nextInt();
   int src_i = -1, src_j = -1;
   int dest_i = -1, dest_j = -1;
   String[][] mat = new String[n][m];
   Queue<Point> q = new LinkedList<Point>();
   boolean[][] visited = new boolean[n][m];
   int steps = -1;
   for(int i =0; i<n; i++)
   	Arrays.fill(visited[i], false);
   for(int i =0; i<n; i++)
   {
   	for(int j=0;j<m;j++)
   	{
   		String tmp = sc.next();
   		if (tmp.equals("#"))
   			{
   				src_i = i;
   				src_j = j;
   			}
   		if(tmp.equals("@"))
   			{
   				dest_i = i; 
   				dest_j = j;
   			}
   		mat[i][j] = tmp;
   	}
   }
   
  	q.offer(new Point(src_i, src_j, 0));
  	steps = path(q,mat,n,m,dest_i,dest_j,visited);
  	 
   System.out.println(steps);	 			
}

static boolean isValid(int i, int j, int n, int m, String[][] mat,boolean[][] visited)
{
	if( i>=0 && j>=0 && i<n && j<m && visited[i][j] == false && ( mat[i][j].equals("1") || mat[i][j].equals("@")))
		return true;
	return false;
}

static int path(Queue<Point> q, String[][] mat, int n, int m, int dest_i, int dest_j, boolean[][] visited)
{
	while(!q.isEmpty())
	{
		Point curr = q.poll();
		int i = curr.row;
		int j = curr.col;
		int val = curr.val;
		
		if(isValid(i-1,j,n,m,mat,visited))
		{
			if(i-1 == dest_i && j == dest_j)
				return val+1;
			visited[i-1][j] = true;
			q.offer(new Point(i-1,j,val+1));
		}
		
		if(isValid(i+1,j,n,m,mat,visited))
		{
			if(i+1 == dest_i && j == dest_j)
				return val+1;
			visited[i+1][j] = true;
			q.offer(new Point(i+1,j,val+1));
		}
	
		if(isValid(i,j-1,n,m,mat,visited))
		{
			if(i == dest_i && j-1 == dest_j)
				return val+1;
			visited[i][j-1] = true;
			q.offer(new Point(i,j-1,val+1));
		}
		
		if(isValid(i,j+1,n,m,mat,visited))
		{
			if(i == dest_i && j+1 == dest_j)
				return val+1;
			visited[i][j+1] = true;
			q.offer(new Point(i,j+1,val+1));
		}
	}
	return -1;
}
}
