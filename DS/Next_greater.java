import java.util.*;

public class Next_greater
{
	public static void main(String[] args)
	{
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter Number of elements : ");
	int n= sc.nextInt();
	
	int[] arr = new int[n];
	
	System.out.print("Enter Array elements : ");
	
	for(int i=0;i<n; i++)
		arr[i] = sc.nextInt();
	
	sc.nextLine();
		
	System.out.print("Enter indexes : ");
	String str = sc.nextLine();
	
	String[] temp = str.split("\\s+");
	
	Stack<Integer> stack = new Stack<Integer>();
	
	int[] nge = new int[n];
	Arrays.fill(nge , -1);
	
	for(int i =0; i<n; i++)
	{
	if(stack.isEmpty())
	{
		stack.push(i);
		continue;
	}
	
	if(!stack.isEmpty() && arr[i] <= arr[stack.peek()])
	{
		stack.push(i);
		continue;
	}
	if(!stack.isEmpty() && arr[i] > arr[stack.peek()])
	{
		while(!stack.isEmpty() && arr[i] > arr[stack.peek()])
		{
				nge[stack.pop()] = arr[i];
		}	
		stack.push(i);
	}
}
	for(int i =0; i< temp.length; i++)
		System.out.print(nge[Integer.parseInt(temp[i])] + " ");
}
}
