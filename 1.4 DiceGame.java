import java.util.Scanner;

public class DiceGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int g = 0;
		int e = 0;
		for (int i=0;i<4;i++)
		{
			g +=sc.nextInt();
		}
		for (int i=0;i<4;i++)
		{
			e +=sc.nextInt();
		}
		if(g==e)
		{
			System.out.println("Tie");
		}
		else if(g<e)
		{
			System.out.println("Emma");
		}
		else if(g>e)
		{
			System.out.println("Gunnar");
		}

	}

}
