import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class wordsfornumbers {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		ArrayList <String> ans= new ArrayList<String>();
		int count=0;
		while (sc.hasNext())
		{
			String temp = sc.nextLine();
			ans.add(temp);
			count++;
		}
		
		Map <String, String> tensMap = new HashMap<String,String>();
		Map <String, String> onesMap = new HashMap<String,String>();
		tensMap.put("2", "twenty");	onesMap.put("1", "one");
		tensMap.put("3", "thirty");	onesMap.put("2","two");
		tensMap.put("4", "forty");	onesMap.put("3", "three");
		tensMap.put("5", "fifty");	onesMap.put("4","four");
		tensMap.put("6", "sixty");	onesMap.put("5","five");
		tensMap.put("7", "seventy");onesMap.put("6","six");
		tensMap.put("8", "eighty");	onesMap.put("7","seven");
		tensMap.put("9", "ninety");	onesMap.put("8", "eight");
		tensMap.put("11", "eleven");onesMap.put("9", "nine");
		tensMap.put("12", "twelve");onesMap.put("0", "zero");
		tensMap.put("13", "thirteen");
		tensMap.put("14", "fourteen");
		tensMap.put("15", "fifteen");
		tensMap.put("16", "sixteen");
		tensMap.put("17", "seventeen");
		tensMap.put("18", "eighteen");
		tensMap.put("19", "nineteen");
		tensMap.put("10", "ten");
		tensMap.put("1", "ten");
		tensMap.put("0", "zero");
		
		String[] answer= new String[ans.size()];
		for (int i=0;i<ans.size();i++)
		{answer[i]="";
			for (int j=0;j<ans.get(i).length();j++)
			{
			  
			   String temp ="";
			   temp += ans.get(i).charAt(j);
			   if (tensMap.containsKey(temp))
			   {
				   //check if its a two didget number
				   if (j==ans.get(i).length()-1){answer[i]+=onesMap.get(temp);}
				   
				   else
				   {
					  
					   String second ="";
					   second += ans.get(i).charAt(j+1);
					   if (onesMap.containsKey(second))
					   {
						   if (second.equals("0"))
						   {
							   answer[i]+=tensMap.get(temp);
						   }else if(temp.equals("1"))//check if its 11-19
						   {
							   String teens = temp+second;
							   answer[i]+=tensMap.get(teens);
						   }else {
							   answer[i]+=tensMap.get(temp)+ "-" + onesMap.get(second);
						   }
						   
						   j++;
					   }else {
						   answer[i]+=onesMap.get(temp);
					   }
				   }
			   }
			   else {answer[i]+=ans.get(i).charAt(j);}

			   if(answer[i].length()>1){
			   answer[i] = answer[i].substring(0, 1).toUpperCase()+answer[i].substring(1);
			   }else {answer[i]=answer[i].toUpperCase();}
			   }
		}
		
		for(int i=0; i<answer.length;i++)
		{
			System.out.println(answer[i]);
		}
		
	
	}
}
