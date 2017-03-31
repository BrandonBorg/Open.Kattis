
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CountingStars {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
		
	int count =0;
	while (sc.hasNext())
	{	
		Queue<Star>	stars = new LinkedList<Star>();
		int starcount =0;
		int x=sc.nextInt();
		int y=sc.nextInt();
		int [][] sky = new int[x][y];
		String line = sc.nextLine();
		for (int i=0;i<x;i++)
		{
			 line = sc.nextLine();
			for (int j=0; j<y;j++)
			{
				char value = line.charAt(j);
				if (value == '-')//If star
				{
					sky[i][j]=1;		
				}else{sky[i][j]=0;}
			}
		}//end of scan sky
		for (int i=0;i<x;i++)
		{
			//System.out.println("");
			for (int j=0;j<y;j++)
			{
			
				if(sky[i][j]==1)//IF star is found
				{
					starcount++;
					Star temp2 = new Star(i,j);
					stars.add(temp2);
					while (!stars.isEmpty())
					{
						Star temp= stars.remove();
						if (temp.x!=0) //adding from the top
						{
							if (sky[temp.x-1][temp.y]==1) //if star above current star exists
							{
								stars.add(new Star(temp.x-1,temp.y)); // add star above to queue
								sky[temp.x-1][temp.y] =0; // remove star from sky
							}
						}
						if (temp.x!=x-1)// adding from bottom
						{
							if (sky[temp.x+1][temp.y]==1)//if star below current star exists
							{
								stars.add(new Star(temp.x+1,temp.y));//add star below to queue
								sky[temp.x+1][temp.y]=0;//remove star from sky
							}
						}
						if (temp.y!=0) //check star to the left
						{
							if (sky[temp.x][temp.y-1]==1)//if star to the left exists
							{
								stars.add(new Star(temp.x,temp.y-1));//add star left to queue
								sky[temp.x][temp.y-1]=0;//remove star from sky
							}
						}
						if (temp.y!=y-1)//adding star to the right
						{
							if (sky[temp.x][temp.y+1]==1)//if star to the right exists
							{
								stars.add(new Star(temp.x,temp.y+1));//add star right to queue
								sky[temp.x][temp.y+1]=0;//remove star right from queue
							}
						}
					}
					
				}
				
			}
		} 
		count++;
		System.out.println("Case " + (count) +": " + starcount);

	}//end of while
	sc.close();

}
	static class Star{
		int x,y;
		Star(int i, int j)
		{
			x=i;
			y=j;
		}
	}
}
	
