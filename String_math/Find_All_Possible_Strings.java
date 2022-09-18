import java.util.*;


class Find_All_Possible_Strings
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =  sc.nextInt();
		sc.nextLine();
		while(t>0)
		{
			String str = sc.nextLine();
			GfG g = new GfG();
			ArrayList<String> arr = g.spaceString(str);
			for(String s : arr){
			    System.out.print(s+"$");
			}
            System.out.println();
			t--;
		}
	}
}

class GfG
{
    ArrayList<String> spaceString(String str)
    {
        ArrayList<String> ans = spaces(str);
        Collections.sort(ans,(a,b) -> b.compareTo(a));
       return ans;
    }
    
    ArrayList<String> spaces(String str)
    {
        
        ArrayList<String> sts = new ArrayList<String>();
        
        if(str.length() == 1)
        {
            sts.add(str);
            return sts;
        }
    
        ArrayList<String> strTemp = spaces(str.substring(1,str.length()));
        
        for(int i = 0; i<strTemp.size(); i++)
        {
           
            sts.add(str.charAt(0) + strTemp.get(i));
             sts.add(str.charAt(0) + " " + strTemp.get(i));
        }
        return sts;
        
    }
    
    
  
}

