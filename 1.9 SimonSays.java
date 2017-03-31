import java.util.Scanner;

public class SimonSays {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		final String key = "simon says";
		String word = sc.nextLine();
		for (int i=0;i<cases;i++)
		{
			 word = sc.nextLine();
			if (word.length()>10)
			{
				if (word.substring(0,10).compareTo(key)==0)
				{
					System.out.println(word.substring(11));
				}
			}
			else { System.out.println();}
			sc.close();
		}
	}
}
