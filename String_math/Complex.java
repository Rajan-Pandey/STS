import java.util.*;

public class Complex
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter  complex numbers : ");
String[] complex1 = sc.next().split("\\+|i");
String[] complex2 = sc.next().split("\\+|i");

long real1 = Long.parseLong(complex1[0]);
long real2 = Long.parseLong(complex2[0]);
long img1 = Long.parseLong(complex1[1]);
long img2 = Long.parseLong(complex2[1]);

long real = (real1*real2) - (img1*img2);

long img = (real1*img2) + (real2*img1);

String product = real + "+" + img + "i";

System.out.println("Product of complex Numbers is : " + product);



}
}
