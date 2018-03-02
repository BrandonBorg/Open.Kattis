import java.util.Scanner;

public class eligibility {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases= sc.nextInt();
		
		for (int c=0; c<cases; c++)
		{
			String name = sc.next();
			String start = sc.next();
			String birth = sc.next();
			String ans ="";
			int courses = sc.nextInt();
			
			int startYear = Integer.parseInt(start.substring(0, 4));
			int birthYear = Integer.parseInt(birth.substring(0, 4));
			
			if (startYear>=2010)
			{
				ans = "eligible";
			}else if (birthYear >= 1991)
			{
				ans = "eligible";
			}else if(courses>40)
			{
				ans = "ineligible";
			}
			else 
			{
				ans = "coach petitions";
			}
			
			
			
			System.out.println(name + " " + ans);
			
		}
		
	}

}
