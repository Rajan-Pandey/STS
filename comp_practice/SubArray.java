import java.util.*;

public class SubArray
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int n  = sc.nextInt();

int[] arr = new int[n];
for(int i=0;i<n;i++)
	arr[i] = sc.nextInt();

int k = sc.nextInt();

int current_sum = 0 , start = 0;
for(int i =0; i<=n; i++)
{
while(current_sum > k && start<i-1)
{
 current_sum -= arr[start++];
}
if(current_sum == k)
 {
   System.out.println(start+1 + " " + i);
  break;
}
 if(i<n)
   current_sum += arr[i];
}
}
}
