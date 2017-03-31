import java.util.Scanner;

public class Spavanac {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		sc.close();
		if (m>=45)
		{
			m = m-45;
		}else if (m<45)
		{
			m = m + 60 -45;
			h = h-1;
		}if (h== -1)
		{
			h = 23;
		}
		System.out.println(h + " " + m);
	}

}
