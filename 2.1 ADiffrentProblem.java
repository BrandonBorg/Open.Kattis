package different;

import java.util.Scanner;

public class ADiffrentProblem {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		while (sc.hasNext()){
			System.out.println(Math.abs(sc.nextLong()-sc.nextLong()));
		}
    sc.close()
	}	

}
