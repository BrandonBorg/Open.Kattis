import java.util.Scanner;

public class PopularVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int cases = sc.nextInt();
		String[] finala = new String[cases];
		for (int i=0;i<cases;i++)
		{
			int winner=-1;
			int tie=0;
			int temp=0;
			int count =0;		
			int can=sc.nextInt();
			int[] votes = new int[can];
		
		
			for(int j=0; j<can;j++)
			{
				votes[j]=sc.nextInt();
				if (votes[j]>temp)
				{
					temp = votes[j];
					winner=j+1;
					tie=0;
				}
				else if (votes[j]==temp)
				{
					tie=1;
				}
			}
			
			for (int j=0; j <can; j++) //votecount
			{
				if (j != winner-1){
				//System.out.println(votes[j]);
				 count+=votes[j];}
				
			}
			if (tie==1)
			{
				finala[i]="no winner";
			}
			else if (votes[winner-1]>count)
			{
				finala[i]="majority winner " + winner; 
			}else if(votes[winner-1]<=count){
				finala[i]="minority winner " + winner;
			}
		}
		for (int i=0;i<cases;i++)
		{
			System.out.println(finala[i]);
		}
		sc.close();
	}

}
