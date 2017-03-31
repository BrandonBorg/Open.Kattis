import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EngineeringEnglish {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> map = new HashMap<String,Integer>();
		Scanner sc = new Scanner(System.in);
		ArrayList<String> ans = new ArrayList<String>();
		String tempans="";
		
		while (sc.hasNextLine())
		{
			tempans="";
			
			String line = sc.nextLine();
			//if (line.equals("exit")){ break;}
			String word="";
			for (int i=0; i<line.length(); i++)
			{
				if (line.charAt(i)== ' ')
				{
					String temp = word.toLowerCase();
					if (!map.containsKey(temp))
					{
						map.put(temp, 1);
						tempans += word + " ";
					}else { tempans += ". ";}
					word ="";
				}else {
					word += line.charAt(i);
				}
			}
			
			String temp = word.toLowerCase();
			if (!map.containsKey(temp))
			{
				map.put(temp, 1);
				tempans += word + " ";
			}else { tempans += ". ";}
			word ="";
			ans.add(tempans);
		}
		sc.close();
		for (int i=0; i<ans.size();i++)
		{
		System.out.println(ans.get(i));
		}
	}

}
