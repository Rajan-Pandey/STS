import java.util.*;

public class Majority
{
public static void main(String[] args)
{
int N;
Scanner sc = new Scanner(System.in);
System.out.print("Input Array Size: ");
N = sc.nextInt();
int[] arr = new int[N];
System.out.print("Input Array elements : ");
for(int i=0;i<N;i++)
	arr[i] = sc.nextInt();
 int res = findMajority(arr,N);
 if(res == -1)	System.out.println("No majority element");
 else System.out.println("Majority Element is : " + res);
}

public static int findMajority(int[] arr, int N)
   {
	Arrays.sort(arr);
	for(int i=0;i<=N/2;i++)
    	   if( (i+N/2 < N) && (arr[i+N/2] == arr[i]))
		    return arr[i];
    	return -1;	
      }
}
