import java.util.Scanner;

public class SodaSurpler{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int e = sc.nextInt();
		int f = sc.nextInt();
		int c = sc.nextInt();
		int total = e+f;
		int drank= c-1;
		int count=0;
		while (total>=c)
		{
			total=total-drank;
			count ++;
		}
		System.out.println(count);
		sc.close();
	}

}
