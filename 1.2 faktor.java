import java.util.Scanner;

public class faktor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int I = sc.nextInt();
		
		double X = (A*I) - A + 1;
		
		double y = X/A;
		if(Math.ceil(y)==I)
		{
			System.out.println((int)X);
		}else
		{
			System.out.println(A*I);
		}
		
	}

}
