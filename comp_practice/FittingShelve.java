import java.util.*;

public class FittingShelve
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Input length of wall : ");
int wall = sc.nextInt();
System.out.print("Input height of one shelf : ");
int m = sc.nextInt(); 
System.out.print("Input height of other shelf : ");
int n = sc.nextInt();



int min_n = 0 , min_m = 0 , min_empty = wall;

int p = wall/m; 
int q = 0;
min_m = p;
min_n = q;
int rem = wall%m;
min_empty = rem;

while(wall >= n)
{
 q += 1;
 wall = wall-n;
 
 p = wall/m;
 rem = wall%m;

if(rem <= min_empty)
{
	min_m = p;
	min_n = q;
	min_empty = rem;
}
}
System.out.println(min_m + " " + min_n + " " + min_empty);
}
}
