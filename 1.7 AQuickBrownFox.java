import java.util.Scanner;

public class AQuickBrownFox{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String temp = "abcdefghijklmnopqrstuvwxyz";
		char[] key = temp.toCharArray();
		String[] ans = new String[n];
		String word = sc.nextLine();
		word = word.toLowerCase();
		for (int i=0; i<n; i++)
		{
			 word = sc.nextLine();
			 word = word.toLowerCase();
			int ln = word.length();
			char[] test = word.toCharArray();
			String temp1 ="";
			for (int x=0; x<26; x++)
			{
				int found = 0;
				for (int y=0; y<ln; y++)
				{
					if(key[x]==test[y])
					{
						found=1;
					}
				}
				if (found==0)
				{
					temp1 += key[x];
				}
			}
			ans[i]=temp1;
		}
		for (int i=0;i<n;i++)
		{
			if(ans[i]=="")
			{
				System.out.println("pangram");
			}
			else{
			System.out.println("missing " +ans[i]);
			}
		}
		sc.close();
	}

}
