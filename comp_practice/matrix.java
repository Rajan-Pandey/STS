import java.util.*;

public class matrix
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int M = sc.nextInt();

int[][] arr = new int[M][M];

//int i =1;
boolean flag = true;
for(int i =0; i<M; i++)
	for(int j =0; j<M; j++)
		arr[i][j] = sc.nextInt();

String row1 = "";
for(int j =0; j<M; j++)
	row1 += arr[0][j];

row1 += row1;

for(int i=1; i<M; i++)
  {
	String temp =  "";
	for(int j = 0 ; j<M; j++)
	{
	temp += arr[i][j];
	}
	if(row1.contains(temp))
		continue;
	else 
	{ 
	flag = false; 
	break;
	}	
  }

if(flag)
	System.out.print("Yes");
else  
	System.out.print("No");
}
}
