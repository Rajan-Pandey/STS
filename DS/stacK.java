import java.util.*;

public class stacK
{

public static void main(String args[])
{
Stack<String> p = new Stack<>();

p.push("My");
p.push("Name");
p.push("is");
p.push("hello");
p.push("Unknown");
p.push("Rajan");


System.out.println(p.search("hello"));

while(!p.isEmpty())
	System.out.println(p.pop());
}
}
