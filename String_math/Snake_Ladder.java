import java.util.*;

public class Snake_Ladder
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
HashMap<Integer,Integer> map = new HashMap<>();
for(int i=0; i<N;i++)
	map.put(sc.nextInt() , sc.nextInt());

int d = sc.nextInt();
int[] moves = new int[d];
for(int i =0; i<d; i++)
	moves[i] = sc.nextInt();

String winner = "";

int pos_A  = 0 , pos_B = 0;

for(int k=0; k<d && pos_A < 99 && pos_B < 99; k++)
{
	if(k%2 == 0)
	{
		if(pos_A + moves[k] > 99) break;
		pos_A =  pos_A + moves[k];
		while(map.containsKey(pos_A))
		{
			pos_A = map.get(pos_A);
		}
	}
	else
	{
		pos_B = pos_B + moves[k];
		while(map.containsKey(pos_B))
		{
			pos_B = map.get(pos_B);
		}		
	}
}

if(pos_A > pos_B)
	winner = "A";
else
	winner = "B";

int final_pos = Math.max(pos_A, pos_B);

System.out.println(winner + " " + final_pos);
}
}
