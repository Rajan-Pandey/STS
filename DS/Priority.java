import java.util.*;




class Person
{
String name;
int p;
Person(String name , int p)
{
this.name = name;
this.p = p;
}
}
public class Priority
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
PriorityQueue<Person> pq = new PriorityQueue<Person>(new Comparator<Person>()
{
public int compare(Person p1, Person p2)
{

	if(p1.p > p2.p)
	return -1;
	else 
	return 1;

}
});


pq.add(new Person("Ram",20));
pq.add(new Person("Rajan",20));
pq.add(new Person("Raju",20));
pq.add(new Person("Raa",20));



ArrayList<Person> list = new ArrayList<Person>();
while(!pq.isEmpty())
{
Person temp = pq.poll();
System.out.println(temp.name + " " + temp.p);
}
}
}
