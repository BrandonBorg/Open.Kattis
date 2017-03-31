import java.util.Scanner;

public class PaulEigon {
	public static void main (String[] args)
	{
		Scanner sc= new Scanner(System.in);
		long N = sc.nextInt();
		long p = sc.nextInt();
		long q = sc.nextInt();
		long turns=(p+q);

		sc.close();
		
		if ((turns / N) % 2 ==0)
		{
			System.out.println("paul");
		}else {
			System.out.println("opponent");
		}
	}

}
