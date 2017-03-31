import java.util.Scanner;

public class TrollHunt {

	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int b = sc.nextInt();
		int k = sc.nextInt();
		int g = sc.nextInt();
		
		sc.close();
		
		int ans=0;
		b--;
		int groups = k/g;
		if (b % groups ==0){
		 ans = b/groups;}
		else {
			ans = (b/groups)+1;
		}
		System.out.println(ans);

	}

}
