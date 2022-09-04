import java.util.*;
import java.text.SimpleDateFormat;

public class GetDayName
{
public static void main(String[] args)
{
Calendar c = Calendar.getInstance();
System.out.println("Today's day is : " + new SimpleDateFormat("EEEE").format(c.getTime()));
System.out.println("Today's date is : " + new SimpleDateFormat("YYYY/MM/dd").format(c.getTime()));
System.out.println(c.get(Calendar.HOUR_OF_DAY));
System.out.println(c.get(Calendar.MINUTE));
System.out.println(c.get(Calendar.SECOND));
Calendar start = Calendar.getInstance();
String s = "2022/09/04";
try
{
Date d =  new SimpleDateFormat("yyyy/MM/dd").parse(s);
start.setTime(d);
System.out.println(start.getTime());
}
catch(Exception e)
{
System.out.println(e);
}
//start.set(Calendar.DAY_OF_MONTH, start.getActualMaximum(Calendar.DAY_OF_MONTH));

System.out.println(start.getTime());
//System.out.println(start.get(Calendar.HOUR_OF_DAY));
}
}


