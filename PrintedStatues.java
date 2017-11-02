import java.util.Scanner;

public class PrintedStatues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int sprint =0;
		int printer=1;
		int newprinter=0;
		int day=0;
		
		while(sprint < s)
		{
			for(int i= printer; i>0; i--)
			{
				if(printer<s)
				{
					newprinter++;
				}
				else {
					sprint++;
				}
			}
			printer += newprinter;
			newprinter =0;
			day++;
		}
		System.out.println(day);
	}

}
