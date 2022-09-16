import java.util.regex.*;
import java.util.*;

public class regex
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Regex : "); //Handling needed for Dangling Characters , need to append \\ before any special character used in regex
String regex = sc.next();

System.out.print("Enter String to be matched : ");
String str = sc.next();

Pattern pattern = Pattern.compile(regex);
Matcher matcher = pattern.matcher(str);

System.out.print(matcher.find());

}
}
