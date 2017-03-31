import java.util.Scanner;

public class ABC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String ans="";
		int[] num =new int[3];
		for (int i =0; i<3;i++)
		{
			num[i]=sc.nextInt();
		}
		
		String letters = sc.next();
		sc.close();
		int max=0, mid=0, min=0;
		for (int i =0; i<3;i++)
		{
			int temp=num[i];
			if (temp>max)
			{
				int tempp=max;
				max=temp;
				temp =tempp;
			}
			if (temp >mid)
			{
				int tempp =mid;
				mid = temp;
				temp =tempp;
			}
			min =temp;
		}

		for(int i=0; i<3;i++)
		{
			if (letters.charAt(i)=='A')
			{
				ans+= (min + " ");
			}
			if (letters.charAt(i)=='B')
			{
				ans += (mid + " ");
			}
			if (letters.charAt(i)=='C')
			{
				ans += (max + " ");
			}
		}
		
		System.out.println(ans);
		
	}

}
