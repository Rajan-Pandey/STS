import java.util.*;

public class p1
{
 public static void main(String[] args)
 {
  Scanner sc = new Scanner(System.in);
 // BufferedReader  br = new BufferedReader(new InputStreamReader(System.in));
  String temp = "";
  String str = "";
do
    {
        temp = sc.nextLine();
        str = str+temp;   
    }while(temp != " ");
    
    System.out.println(str);
    
 }  
}
