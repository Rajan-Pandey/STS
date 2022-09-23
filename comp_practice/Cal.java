import java.util.*;
import java.text.*;

public class Cal
{
public static void main(String[] args)
{
Calendar start = Calendar.getInstance();
//Calendar end = Calendar.getInstance();

int[] days = {31,28,31,30,31,30,31,31,30,31,30,31};
String[] Day = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};

start.set(Calendar.DAY_OF_MONTH,1);
start.add(Calendar.MONTH,5);

int year = start.get(Calendar.YEAR), month = start.get(Calendar.MONTH);

if(year % 4 ==0)
	days[1] = 29;

System.out.println(year + " " + month);
System.out.println(start.get(Calendar.DAY_OF_MONTH));
System.out.println(start.getTimeInMillis());

Date d = null;
String s = "18-03-2022";
try
{
d = new SimpleDateFormat("dd-MM-yyyy").parse(s);
}
catch(Exception e)
{}
System.out.println(d);

Calendar dayss = Calendar.getInstance();
dayss.setTime(d);

System.out.println(Day[dayss.get(Calendar.DAY_OF_WEEK)-1]);
}
}
