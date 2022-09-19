import java.util.*;


public class Sum_of_large_numbers {

    public static void main(String[] args)
    {
    Scanner sc = new Scanner(System.in);	
	String s1 = sc.next();
	String s2 = sc.next();
	System.out.println(findSum(s1,s2));
  }
   static  String findSum(String X, String Y) {

        StringBuilder ans = new StringBuilder();
        
        String s1 = "", s2 = "";
       
        int n1 = X.length();
        
        int n2 = Y.length();
        if(n1 >= n2)
            {
                s1 = X.trim();
                s2 = Y.trim();
            }
       else 
       {
           s1 = Y.trim(); s2= X.trim();
       }
        int i = Math.min(n1,n2)-1;
        int j = Math.max(n1,n2)-1;
        int carry = 0;
        
        for( ; i>=0; i--,j--)
        {
            int temp_sum =  (s1.charAt(j) - '0')  + (s2.charAt(i) - '0') + carry;
            if(temp_sum > 9)
            {
                carry = temp_sum / 10;
                temp_sum = temp_sum%10;
            }
            else carry = 0;
            
           // System.out.println(temp_sum + " " + carry);
            
            ans.append(temp_sum);
        }
        
       //System.out.println(carry);
        if(j>=0)
        {
            while(j >=0 )
            {
                int temp_sum = (s1.charAt(j) - '0') + carry;
                if(temp_sum > 9)
            {
                carry = temp_sum / 10;
                temp_sum = temp_sum%10;
            }
            else carry = 0;
            
            //  System.out.println(temp_sum + " " + carry);
            ans.append(temp_sum);
              --j;  
            }
        }
        
        if(carry > 0)
        ans.append(carry);
        String f = ans.reverse().toString();
        int k =0;
        for(; k<f.length(); k++)
        {
            if(f.charAt(k) != '0')
                break;
        }
        
        
        if(k == f.length())
            return "0";
        return f.substring(k);
    }
}
