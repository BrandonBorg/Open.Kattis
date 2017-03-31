import java.util.Scanner;

public class HIddenPassword{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String key = sc.next();
		String pass = sc.next();
		sc.close();
		int letter=0;
		int BREAK =0;
		int PASS =0;
		
		for (int i=0;i<pass.length();i++)
		{
			if (letter==key.length()-1){}else{
			for (int j=letter+1;j<key.length();j++)
			{
				if (pass.charAt(i)==key.charAt(j))
				{
					if (key.charAt(j)!=key.charAt(letter))
					{
					System.out.println("FAIL");
					BREAK=1;
					PASS++;
					break;}
				}
			}if (BREAK==1) {break;}
			}
			if (pass.charAt(i)==key.charAt(letter))
			{
				if (letter==key.length()-1)
				{
					System.out.println("PASS");
					PASS++;
					break;
				}
				letter++;
		
			}
		}
	
		if (PASS==0)
		{
			System.out.println("FAIL");
		}
	}
}
