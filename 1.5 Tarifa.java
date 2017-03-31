import java.util.Scanner;

public class Tarifa {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int bar = sc.nextInt();
	int ans=bar;
	int months = sc.nextInt();
	for (int i=0;i<months; i++)
	{
		ans+=bar;
		int data=sc.nextInt();
		ans -= data;
		
	}
	System.out.println(ans);
	sc.close();
	}

}
