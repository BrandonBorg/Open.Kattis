import java.util.Scanner;

public class DiceCup {
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		int one = sc.nextInt();
		int two = sc.nextInt();
		int i;
		if (one>two){
			for (i=two+1; i<=one+1; i++){
			System.out.println(i);
			}
		}
		if (two>one){
			for (i=one+1; i<=two+1; i++){
			System.out.println(i);
			}
		}
		if (one==two){
			System.out.println(two+1);
		}
		sc.close();
	}
}


