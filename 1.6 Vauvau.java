import java.util.Scanner;

public class Vauvau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int attk1 = sc.nextInt();
		int sleep1 = sc.nextInt();
		int attk2 = sc.nextInt();
		int sleep2 = sc.nextInt();
		
		int count1 =1, count2=1, dog1=1,dog2=1; 
		String[] result =new String [3];
		int[] man = new int[3];
		for (int i=0; i<3; i++)
		{
			man[i]=sc.nextInt();
		}
		
		for (int i=0;i<3;i++)
		{
			int mins = man[i]-1;
			dog1=1;
			dog2=1;
			count1=1;
			count2=1;
			while (mins>=0)
				
			{
				if (dog1==1 && dog2==1 && mins==0)
				{
					result[i]="both";
				}
				else if((dog1==1  || dog2==1) && mins==0)
				{
					
					result[i]="one";
				}
				else if(mins==0)
				{
					result[i]="none";
				}
				count1++;
				count2++;
				mins--;
				
				if (dog1==1)//
				{
					if (count1>attk1)
					{
						count1 =1;
						dog1=0;
					}
				}if (dog1==0)
				{
					if (count1>sleep1)
					{
						count1=1;
						dog1=1;
					}
				}
				if (dog2==1)//
				{
					if (count2>attk2)
					{
						count2 =1;
						dog2=0;
					}
				}if (dog2 ==0)
				{
					if (count2>sleep2)
					{
						count2=1;
						dog2=1;
					}
				}
				
			}
		}
		sc.close();
		//output
		for (int i=0;i<3;i++)
		{
			System.out.println(result[i]);
		}

	}

}
