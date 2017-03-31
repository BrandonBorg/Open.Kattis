import java.math.BigInteger;
import java.util.Scanner;

public class SimpleAddition{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger i = sc.nextBigInteger();
		BigInteger x = sc.nextBigInteger();
		sc.close();
		System.out.println(i.add(x));
	}

}
