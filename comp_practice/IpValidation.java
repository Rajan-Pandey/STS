/*You are given a string str in the form of an IPv4 Address. Your task is to validate an IPv4 Address, if it is valid return true otherwise return false.

IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1

A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255. Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255)

Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.
*/

import java.util.*;

public class IpValidation
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String ip =  sc.next();

boolean flag = validate(ip);

	 if( flag == true ) 
	 	System.out.println("Valid IPv4 Address");
	 else
	 	System.out.println("Invalid IPv4 Address");
}

static boolean validate(String ip)
{
String[] str  = ip.split("\\.");

if(ip.length() < 7 || ip.length() > 15)
	return false;

if(str.length != 4)
	return false;

for(String curr : str)
{
	if(curr.isEmpty() || curr.length() > 3 )
		return false;
	
	if(curr.charAt(0) == '0' && curr.length() > 1)
		return false;
	
	for(char ch : curr.toCharArray())
	{
		if(! Character.isDigit(ch))
			return false;
	}
	
	int num = Integer.parseInt(curr);
		if(num  < 0 || num > 255)
			return false; 
	
}
	return true;
}
}

