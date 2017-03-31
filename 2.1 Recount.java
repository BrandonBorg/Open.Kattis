import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Recount {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		Map <String, Integer> box = new HashMap<String, Integer>();
		int condition=0;
		String vote;
		ArrayList <String> names = new ArrayList<String>();
		int [] count= new int[100000];
		int i=0;
		while  (condition==0)
		{
			vote = sc.nextLine();
			if (vote.equals("***")){condition=1;}
			else 
			if (box.containsKey(vote))
			{
				int x = box.get(vote);
				int temp=count[x];
				count[x]=temp+1;
				
				
			}else
			{
				names.add(i,vote);
				count[i]=1;
				box.put(vote, i);
				i++;
			}
			
		}
		int winner=0;
		int max=0;
		boolean tie =false;
		for (int j=0;j<names.size();j++)
		{
			
			if (count[j]==max)
			{
				tie=true;
			}
			if (count[j]>max)
			{
				max=count[j];
				winner=j;
				tie=false;
			}
		}
		
		if (tie)
		{
			System.out.println("Runoff!");
		}else{
			System.out.println(names.get(winner));
		}
		sc.close();
			
	}
}
