import java.text.*;
import java.util.*;


public class Time
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.println("Enter Time  ");
String string = "12:20:55 PM";
Date d= null;
try
{
d = new SimpleDateFormat("hh:mm:ss aa").parse(string);
}
catch(Exception e)
{
}

Calendar cal = Calendar.getInstance();
cal.setTime(d);
System.out.print(cal.get(Calendar.HOUR) + " " + cal.get(Calendar.AM_PM) + " " + cal.get(Calendar.MINUTE));


}
}
