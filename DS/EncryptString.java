/*You are given a string S. Every sub-string of identical letters is replaced by a single instance of that letter followed by the hexadecimal representation of the number of occurrences of that letter. Then, the string thus obtained is further encrypted by reversing it [ See the sample for more clarity ]. Print the Encrypted String.

Note: All Hexadecimal letters should be converted to Lowercase letters.
*/

import java.util.*;

public class EncryptString
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();

 String str = ""; 
        
        long count = 1;
        for(int i =0; i<s.length()-1; i++)
        {
            if(s.charAt(i)  == s.charAt(i+1))
                count++;
                else
                {
                    str = Long.toHexString(count) +  s.charAt(i) + str;
                    count = 1;
                }
        }
        
        str = Long.toHexString(count) + s.charAt(s.length()-1) + str;
        System.out.println(str);
}
}
