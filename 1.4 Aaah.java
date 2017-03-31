import java.util.Scanner;

public class Aaah {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String jon = sc.next();
		String doc = sc.next();
		if (doc.length()>jon.length()){
			System.out.println("no");
		}else System.out.println("go");
		sc.close();

	}

}
