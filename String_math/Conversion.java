import java.util.*;

class Conversion
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter Binary : ");
String binary = sc.nextLine();
System.out.print("Enter Octal : ");
String octal = sc.nextLine();
System.out.print("Enter HexaDecimal : ");
String hexa = sc.nextLine();
//String test = sc.nextLine();
//int rad = test.indexOf('.');
//System.out.println(rad);

System.out.println("Decimal Equivalent of Binary : " + Integer.parseInt(binary,2));
System.out.println("Decimal Equivalent of Octal : " + Integer.parseInt(octal,8));
System.out.println("Decimal Equivalent of HexaDecimal : " + Integer.parseInt(hexa,16));

System.out.print("Enter Decimal : ");
int decimal = sc.nextInt();
String bin = Integer.toBinaryString(decimal);
String oct = Integer.toOctalString(decimal);
String hex = Integer.toHexString(decimal);
System.out.println("Binary Equivalent is : " + bin);
System.out.println("Octal Equivalent is : " + oct);
System.out.println("HexaDecimal Equivalent is : " + hex);
}
}
