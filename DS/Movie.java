import java.util.*;

class data
{
int rating;
String Name;
data(String Name , int rating)
{
this.Name = Name;
this.rating =rating;
}
}

public class Movie
{
public static void main(String[] args)
{
HashMap<String,Integer> map = new HashMap<String,Integer>();
Scanner sc = new Scanner(System.in);
String in = sc.nextLine();
while(!in.equals("THE END"))
{ 
	in.trim();
	String[] temp = in.split("#");
	//System.out.println(temp[0].trim() + temp[1].trim()+"Hello");
	String movie = temp[0].trim();
	Integer rate = Integer.parseInt(temp[1].trim());
	if(map.containsKey(movie))	
	{
		int val = map.get(movie);
		map.put(movie,val+rate);
	}
	else map.put(movie,rate);
	
	in = sc.nextLine();
}
	int s = map.size();
	int i = 0;
	data[] D = new data[s];
	for(Map.Entry<String,Integer> m : map.entrySet())
	{
	D[i++] = new data(m.getKey(),m.getValue()); 
	}	
	Arrays.sort(D,new Comparator<data>()
	{
	public int compare(data d1, data d2)
	{
		if(d1.rating == d2.rating)
		{
			String a = d1.Name;
			String b = d2.Name;
			return a.compareTo(b);
		}		
		else
			return d2.rating - d1.rating;
	}
});

	System.out.println();
	
    for(data X : D)
	System.out.println(X.Name + " " + X.rating);




}
}

