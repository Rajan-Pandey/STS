import java.util.*;

class Team 
{
String name;
int points; 
double runrate;

Team(String name)
{
this.name = name;
this.points = 0;
this.runrate = 0.0;
}
}

public class trial
{
public static void main(String[] args)
{
Scanner sc = new Scanner(System.in);

int N = sc.nextInt();
sc.nextLine();
Team[] t = new Team[N];

ArrayList<String> str = new ArrayList<>();

for(int i=0; i<N; i++)
{
String name = sc.nextLine();
t[i] = new Team(name);
str.add(name);
}

int M = sc.nextInt();
sc.nextLine();
for(int i =0; i<M; i++)
{
String[] temp = sc.nextLine().split("\\s+");
double d1 = Double.parseDouble(temp[1]);
double d2 = Double.parseDouble(temp[3]);
int index1 = str.indexOf(temp[0]);
int index2 = str.indexOf(temp[2]); 

if(d1 == d2)
	{	
	t[index1].points += 1;
	t[index2].points += 1;
	}
else if(d1 > d2)
	t[index1].points += 2;
else t[index2].points += 2;


t[index1].runrate += d1;
t[index2].runrate += d2;
}

Arrays.sort(t,new Comparator<Team>()
{
	public int compare(Team o1, Team o2)
	{
		if(o1.points == o2.points)
			{
			if(o1.runrate < o2.runrate) 
				return 1;
			else if(o1.runrate > o2.runrate)
				return -1;
			else return 0;	
			}
		else if(o1.points < o2.points)
				return 1;
		else return -1;
	}
});

for(int i =0; i<N; i++)
	System.out.println(t[i].name + " " + t[i].points + " " + t[i].runrate);


}
}
