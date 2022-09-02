import java.util.*;

public class MinProduct
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Input size of array : ");
int n = sc.nextInt();
int count_neg = 0;
int count_zero = 0;
int negative = Integer.MIN_VALUE;
int positive = Integer.MAX_VALUE;
int product = 1;
int[] arr = new int[n];
System.out.print("Input elements of array : ");
for(int i =0;i<n;i++)
{
	arr[i] = sc.nextInt();
	if(arr[i] == 0)
	count_zero++;
	else if(arr[i] < 0)
	{
	count_neg++;
	negative = Math.max(negative , arr[i]);
	}
	else
	positive = Math.min(positive , arr[i]);

	if(arr[i] != 0)
	product *= arr[i];
	else continue;
}
if(count_zero == n || (count_zero > 0 && count_neg == 0))
	System.out.println("Min Possible Product : " + 0 );
else if(count_neg > 0 && count_neg % 2 == 0)
	System.out.println("Min Possible Product : " + product/negative);
else if(count_neg > 0 && count_neg % 2 != 0)
	System.out.println("Min Possible Product : " + product);
else if(count_neg == 0 )
	System.out.println(product);

}
}
