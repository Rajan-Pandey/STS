import java.util.*;

public class Binary
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String str = sc.nextLine();

//long number = Long.parseLong(str);

int decimal = 0;
int counter = 0;
for(int i = str.length()-1 ; i>=0; i--)
{
	if(str.charAt(i) == '0')
	//number /= 10;
	++counter;
	else
	{	
		decimal += Math.pow(2,counter);
		++counter;
	}
}

System.out.println(decimal);

String[] hex = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};

String Hexa = "";
while(decimal >0)
{
	int rem  = decimal%16;
	Hexa += hex[rem];
	decimal = decimal/16;
}
System.out.println(Hexa);
}
}
