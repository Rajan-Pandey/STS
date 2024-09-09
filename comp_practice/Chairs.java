/*Given an integer N representing the total size of groups S, their entry T1 and exit timings T2. This means that group number i will come at T1[i], leave at T2[i], and have a variable size in group S[i]. the task is to find the minimum number of chairs to be bought so that every customer has a chair to sit in.

nput: N = 5, T1 = {7, 18, 16, 14, 16}, T2 = {18, 21, 23, 16, 22}, S = {8, 11, 20, 4, 7}
Output: 46
Explanation: Between time [18, 18], Groups 1, 2, 3, and 5 will be concurrent of size 46.

Input: N = 4, T1 = {20, 9, 16, 2}, T2 = {24, 10, 23, 6}, S = {8, 3, 20, 10}
Output: 28
Explanation: Between time [20, 23], Groups 1 and 3 will be concurrent with size 28.

Input: N = 4, T1 = {6, 9, 1, 6}, T2 = {11, 18, 18, 8}, S = {5, 19, 5, 14}
Output: 29
Explanation: Between time [9, 11], Groups 1, 2, and 3 will be concurrent of size 29.

*/

import java.util.*;

class group
{
int arr;
int dept;
int num;

group(int a, int b, int c)
{
this.arr = a;
this.dept = b;
this.num = c;
}
public String toString()
{
	return this.arr +  " " + this.dept + " "  + this.num ;
	}
}

public class Chairs
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter number of groups : ");
int n = sc.nextInt();
ArrayList<group> list = new ArrayList<group>();
Stack<group> stack = new Stack<>();
System.out.print("Enter arrival time, departure and number of members of each group : ");
for(int i = 0; i < n ; i++)
{
	list.add(new group(sc.nextInt(), sc.nextInt(), sc.nextInt()));
}
Collections.sort(list, new Comparator<group>()
{
	public int compare(group g1, group g2)
		{
			if(g1.arr < g2.arr)
				return -1;
			else if(g1.arr == g2.arr)
				{
					return g2.dept - g1.dept;
				}
			return 1;
		
		}
}
);
/*for(int i =0; i<list.size(); i++)
	System.out.println(list.get(i).toString());
*/

stack.push(list.get(0));
int count = list.get(0).num;
int max = Integer.MIN_VALUE;
for(int i =1; i<list.size(); i++)
	{
	group temp = list.get(i);
	if(temp.arr < stack.peek().dept)  //overlapping interval
		{
			count += temp.num;
			stack.push(temp);
		}
	else
	{
		while(!stack.isEmpty())
			{
				group top = stack.pop();
				if(temp.arr >= top.dept)
					count -= top.num;
				else
					break;
			}
			count += temp.num;
			stack.push(temp);
	}
	max = Math.max(count, max);
	}
	System.out.println("Minimum chairs needed : " + max);
}
}
