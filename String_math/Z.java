public class Z
{
public static void main(String[] args)
{
String s = "Rajan@12345		A&Pandey#Yours$12345";
String tr = "a+ib";
String[] tra = tr.split("\\+i");
for(String temp : tra)
	System.out.println(temp);
System.out.println(s);


String string = "Rajan123Pandey 456@HelloWorld";

System.out.println(string.toUpperCase() + " " + string.toLowerCase() + " " + string);

System.out.println("Contains : " + "Pandees".contains("Pandee"));


String[] str = s.split("(\\s+|[^a-zA-Z0-9])");

s = s.replaceAll("\\s+|[^a-zA-Z0-9]","");

int num = 1100;

String hex = Integer.toBinaryString(num);
System.out.println("Hexa : " + hex);

for(String st : str)
	System.out.println(st);

System.out.println(s);


String stt = "Rajan";

char[] arr = stt.toCharArray();

//stt.getChars(0,stt.length(),arr,0);

for(char ch : arr)
	System.out.print(ch + " ");

StringBuilder sb = new StringBuilder(stt);
System.out.println();
sb.append("Nupur");
System.out.println(sb);

int dec = 625;
String hexa = Integer.toHexString(dec);

System.out.println("Hexadecimal  : " + hexa);

double d2 = 3.14159;
double d1 = Double.parseDouble("314159e-5");
System.out.println(d1 + " " + (d1 == d2));

int n = 2512300;

System.out.println(Integer.rotateLeft(n,2));
System.out.println(Integer.rotateRight(n,1));
System.out.println(Integer.numberOfTrailingZeros(n));

long a = Math.round(5.96);
long b = Math.round(5.45);

System.out.println(a + " " + b);

System.out.println(Math.toDegrees(2*Math.PI));
System.out.println(Math.toRadians(75));


}
}
