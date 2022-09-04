import java.util.*;
import java.text.*;

public class NonWorkingDays
{
public static void main(String[] args)
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter Date in yyyy-MM-dd format: ");
String date = sc.nextLine();

ArrayList<Integer> list = new ArrayList<Integer>();

System.out.print("Enter Non Working days : ");
String holidays = sc.nextLine();

String[] hol = holidays.split(",");

for(String s : hol)
	list.add(Integer.parseInt(s));
Date d  = null;
String day = null;
try
{
d = new SimpleDateFormat("yyyy-MM-dd").parse(date);

day = new SimpleDateFormat("EEEE").format(d);
}
catch(Exception e)
{
System.out.println(e);
}
System.out.println("Day : " + day);
printresult(d,list);
}


public static void printresult(Date d , ArrayList<Integer> list)
{
Calendar startcal = Calendar.getInstance();
Calendar endcal = Calendar.getInstance();

int result = 0;

startcal.setTime(d);
endcal.setTime(d);

startcal.set(Calendar.DAY_OF_MONTH,1);
endcal.set(Calendar.DAY_OF_MONTH,endcal.getActualMaximum(Calendar.DAY_OF_MONTH));

while(startcal.getTimeInMillis() <= endcal.getTimeInMillis())
//while(startcal != endcal)
{
if( startcal.get(Calendar.DAY_OF_WEEK) == 7 ||
	 startcal.get(Calendar.DAY_OF_WEEK) == 1 || list.contains(startcal.get(Calendar.DAY_OF_MONTH)))

result++;

startcal.add(Calendar.DAY_OF_MONTH,1);
}

System.out.println("No. of Non Working days : " + result);

}

}
