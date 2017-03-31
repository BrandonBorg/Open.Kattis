import java.util.Scanner;

public class TakeTwoStone  {

	public static void main(String[] args) {
		//lower the alphabet the greater
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String word1 = sc.next();
		String word2 = sc.next();
		String temp=word2;
		int nien=0;
		if (word1.charAt(0)>=word2.charAt(0)){
			for (int i=0; i<x-2; i++)
			{
				String next= sc.next();
				if (temp.charAt(0)<next.charAt(0))
				{	
					nien=1;
				}
				if (temp.charAt(0)==next.charAt(0))
				{
					int c=0;
					while (temp.charAt(c)==next.charAt(c)&&c<=temp.length()&&c<=next.length())
					{
						
						if (temp.charAt(c)<next.charAt(c))
						{	
							nien=1;
						}c++;
					}
				}
			}if (nien==0)
			{
				System.out.println("DECREASING");
			}
		}if(word1.charAt(0)<=word2.charAt(0)){
			for (int i=0; i<x-2; i++)
			{
				String next= sc.next();
				if (temp.charAt(0)>next.charAt(0))
				{	
					nien=1;
				}
				if (temp.charAt(0)==next.charAt(0))
				{
					int c=0;
					while (temp.charAt(c)==next.charAt(c)&&c<temp.length()&&c<next.length())
					{
						
						if (temp.charAt(c)>next.charAt(c))
						{	
							nien=1;
						}
					}c++;
				}
			}if (nien==0)
			{
				System.out.println("INCREASING");
			}
		
		}
		if (nien==1)
		{
			System.out.println("NEITHER");
		}
		sc.close();
	}

}
