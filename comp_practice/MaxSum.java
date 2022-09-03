import java.util.*;

public class MaxSum
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Input Array Size : ");
int n = sc.nextInt();
int sum = 0;
PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

System.out.print("Input Array Elements : ");
for(int i =0; i<n; i++)
	pq.add(sc.nextInt());

System.out.print("Input no of negations allowed : ");
int k = sc.nextInt();

while(k-- > 0)
{

int temp = pq.poll();
pq.add(temp * (-1));
}

for(int i = 0;i<n; i++)
	sum += pq.poll();

System.out.println("Maximum Sum is : " + sum);

}
}
