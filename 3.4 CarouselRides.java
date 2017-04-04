import java.util.Scanner;

public class CarouselRides {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true)
		{
			int n = sc.nextInt();//cases
			int m = sc.nextInt();//max tickets bought
			double[][] lowestR= new double [1][3];// 00=tickets 01=price 03=ratio
			
			if (n==0 && m==0)
			{
				break;
			}
			
			for (int i=0; i<n; i++)
			{
				double a =sc.nextInt();
				double b =sc.nextInt();
				double ratio = b/a;
				
				if ((a<=m))
				{
						
					if(lowestR[0][2]==0.0)
					{
						
						lowestR[0][0]=a;
						lowestR[0][1]=b;
						lowestR[0][2]=ratio;
					}
					else if (ratio==lowestR[0][2])
					{
					
						if (a > lowestR[0][0])
						{
							
							lowestR[0][0]=a;
							lowestR[0][1]=b;
							lowestR[0][2]=ratio;
						}
					}else
						if (ratio<lowestR[0][2])
						{
							
							lowestR[0][0]=a;
							lowestR[0][1]=b;
							lowestR[0][2]=ratio;
					}
				}
			}
			if(lowestR[0][0]==0.0)
			{
				System.out.println("No suitable tickets offered");
			}else
			{
				System.out.println("Buy " + (int)lowestR[0][0] + " tickets for $" + (int)lowestR[0][1]);
			}
			sc.close();
			
		}

	}

}
