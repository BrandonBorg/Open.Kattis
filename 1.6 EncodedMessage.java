import java.util.Scanner;

public class EncodedMessage {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cases=sc.nextInt();
		String[] output = new String[cases];
		String input;
		for (int c=0; c<cases;c++)
		{
			input = sc.next();
			int dim= (int) Math.sqrt(input.length());
			char[][] encode = new char [dim][dim];
			String ans ="";
			int tr=0;
			for (int a=0; a<dim; a++)
			{
				for (int b=0; b<dim; b++)
				{
					encode[a][b] = input.charAt(tr);
					tr++;
				}
			}
			
			for (int j=dim-1; j>=0; j--)
			{
				for (int i=0; i<dim;i++)
				{
					ans+=encode[i][j];
				}
			}
			output[c] = ans;
			
		}
		sc.close();
		for(int i=0; i<cases;i++)
		{
			System.out.println(output[i]);
		}	
	}
}
