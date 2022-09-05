import java.util.*;

public class All
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter String : ");
String str = sc.nextLine();

String[] s = str.split("\\s+");
int wcount = s.length;
int vcount = 0;
HashMap<Character,Integer> map = new HashMap<>();
for(int i =0; i<str.length(); i++)  
{
    if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u' || str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U')
        vcount++; 
}

for(int i = 0; i<str.length(); i++)
{
    char ch = str.charAt(i);
    if(map.containsKey(ch))
    {
        int temp = map.get(ch);
        map.put(ch,temp+1);
    }
    else
        map.put(ch,1);
}

for(Map.Entry m : map.entrySet())
    System.out.println(m.getKey() + " " + m.getValue());

System.out.println("No. of Words : " + wcount);
System.out.println("No. of Vowels : " + vcount);
}
}
