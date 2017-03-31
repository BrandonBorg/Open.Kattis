import java.util.Scanner;

public class FlowLayout {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int done =0;
		while (done==0)
		{
			int bound = sc.nextInt();
			if (bound==0)
			{
				done =1;
			}
			else
			{	
				int maxW =0;
				int maxH=0;
				int curW=0;
				int prevH=0;
				int curH=0;
				int check=0;
				while (check==0)
				{
					int w = sc.nextInt();
					int h = sc.nextInt();
					if (w ==-1 && h ==-1)
					{
						check=1;
					}
					else
						{
						int temp = curW + w;
						if (temp>bound)
						{
							curW = w;
							prevH =maxH;
							maxH += h;
						}else 
						{
							curW += w;
							if (curW>maxW)
							{
								maxW= curW;
							}
							curH = prevH+h;
							if (curH>maxH)
							{
								maxH=curH;
							}
						}
						}
				}
				System.out.println(maxW + " x " + maxH);
				sc.close();
			}
		}
		
	}

}
