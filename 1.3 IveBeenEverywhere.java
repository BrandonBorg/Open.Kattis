import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class IveBeenEverywhere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases= sc.nextInt();
		for (int i=0; i<cases; i++)
		{
			int cities = sc.nextInt();
			Map <String, Integer> hm = new HashMap<String, Integer>();
			for (int j=0; j<cities; j++)
			{
				hm.put(sc.next(), 0);
			}
			sc.close();
			System.out.println(hm.size());
		}

	}

}
