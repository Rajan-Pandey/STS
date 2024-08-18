import java.util.*;

public class pangram
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String temp = "";
		String s = "";;
		
		int flag = 0;
		
		do
    		{
        		temp = sc.nextLine();
       			 s = s+temp;   
    		}while(!temp.equals(""));
		
		int[] count = new int[26];
		for(int i = 0; i< s.length()-7; i++)
		{
			char ch = s.charAt(i);
			if(Character.isLetter(ch))
				{
					if('a' >= ch && ch <= 'z')
						count[ch-'a']++;
					else if('A' >= ch && ch <='Z')
						count[ch-'A']++;
				}
		}
		
		for(int i =0; i<26; i++)
		{
		if(count[i] == 0)
		{
			flag = 1;
			System.out.print((char) ('A' + i));
			System.out.print(" ");
		}
	}
	
	if(flag == 0)
		System.out.println("NONE");
}
}
