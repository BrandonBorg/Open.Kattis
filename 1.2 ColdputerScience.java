import java.util.Scanner;

public class ColdputerScience{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int num = sc.nextInt();
		int count=0;
		for (int i=0;i<num;i++){
			if (sc.nextInt()<0){count++;}
		}
		System.out.println(count);
		sc.close();
	}
}
