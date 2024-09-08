import java.util.*;

public class Map_Traversal
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
ArrayList<Integer> list = new ArrayList<Integer>();
HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
int temp;
while(!((temp = sc.nextInt()) == -1))
{
	list.add(temp);
	if(map.containsKey(temp))
		map.put(temp, map.get(temp)+1);
	else
		map.put(temp, 1);
}

int max = 0;
int index = 0;
for(Map.Entry<Integer, Integer>  entry : map.entrySet()) {
	int tmp = entry.getValue();
	if(tmp > max){
		max = tmp;
		index = entry.getKey();
		}
}

System.out.println("Mode is : " + index);
}
}
