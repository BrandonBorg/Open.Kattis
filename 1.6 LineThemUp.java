import java.util.Scanner;

public class LineThemUp {

		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			int cases = sc.nextInt();
			String string1 = sc.next();
			String string2 = sc.next();
			int none = 0;
			String first = string2;
			String second;
			
			if(string1.compareTo(string2)<0)//increasing
			{
				for (int i=0;i<cases-2;i++)
				{
					second=sc.next();
					if (first.compareTo(second)>0)
					{
						none=1;
					}
					first=second;
				}
				if (none==0)
				{
					System.out.println("INCREASING");
				}else{System.out.println("NEITHER");}
				
			}//
			else if(string1.compareTo(string2)>0)//Decreasing
			{
				for (int i=0;i<cases-2;i++)
				{
					second=sc.next();
					if (first.compareTo(second)<0)
					{
						none=1;
					}
					first=second;
				}
				if (none==0)
				{
					System.out.println("DECREASING");
				}else{
					System.out.println("NEITHER");
					}	
			}
			sc.close();
		}
}
