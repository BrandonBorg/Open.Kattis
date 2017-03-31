import java.util.Scanner;

public class twentyfortyeight {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[][] arr= new int[4][4];
		for (int i=0; i<4; i++)
		{
			for (int j=0; j<4; j++)
			{
				arr[i][j] = sc.nextInt();
			}
		}
		int direction = sc.nextInt();
		
		if (direction == 0)
		{
			for (int i=0;i<4;i++)
			{
				for(int j=0;j<4;j++)
				{
					
					if(arr[i][j]==0)		//num is 0 case
					{
					  int x = j+1;
					  while (arr[i][j] == 0 && x <4)
					  {
								if (arr[i][x]!=0)
								{
									arr[i][j] = arr[i][x];
									arr[i][x]=0;
								}
								x++;
					  }	
						
					}
					if(arr[i][j]!=0)//addcase
					{
						int temp = arr[i][j];
						int x = j+1;
						while (arr[i][j] == temp && x<4)
						{
							if (arr[i][x] == arr[i][j])
							{
								arr[i][j] += arr[i][j];
								arr[i][x] =0;
							}
							if(arr[i][x]!=0){x+=4;}
							x++;
						}
					}
				}
			}
		}//
		
		if (direction == 1)
		{
			for (int j=0;j<4;j++)
			{
				for(int i =0;i<4;i++)
				{
					if (arr[i][j]==0)
					{
						int x =i+1;
						while(arr[i][j]==0 && x<4)
						{
							if (arr[x][j]!=0)
							{
								arr[i][j]=arr[x][j];
								arr[x][j]=0;
							}
							x++;
						}
					}
					if(arr[i][j]!=0)//addcase
					{
						int temp = arr[i][j];
						int x = i+1;
						while (arr[i][j] == temp && x<4)
						{
							if (arr[x][j] == arr[i][j])
							{
								arr[i][j] += arr[i][j];
								arr[x][j] =0;
							}
							if(arr[x][j]!=0){x+=4;}
							x++;
						}
					}
				}
				
			}
		}
		
		
		if (direction == 2)
		{
			for (int i=0;i<4;i++)
			{
				for (int j=3; j>=0;j--)
				{
					if (arr[i][j]==0)//0 case
					{
						int x = j-1;
						while(arr[i][j]==0 && x>=0)
						{
							if (arr[i][x]!=0)
							{
								arr[i][j]=arr[i][x];
								arr[i][x]=0;
							}
							x--;
						}
					}
					if (arr[i][j]!=0)
					{
						int x =j-1;
						int temp = arr[i][j];
						while(arr[i][j]==temp && x>=0)
						{
							if (arr[i][x] == arr[i][j])
							{
								arr[i][j] += arr[i][j];
								arr[i][x] =0;
							}
							if(arr[i][x]!=0){x-=4;}
							x--;
						}
					}
				}
			}
		}//
	
		if (direction == 3)
		{
			for (int j=0;j<4;j++)
			{
				for (int i=3;i>=0;i--)
				{
					if (arr[i][j]==0)
					{
						int x = i-1;
						while (arr[i][j]==0 && x>=0)
						{
							if (arr[x][j]!=0)
							{
								arr[i][j]=arr[x][j];
								arr[x][j] = 0;
							}
							x--;
						}
					}
					if (arr[i][j]!=0)//addcase
					{
						int temp = arr[i][j];
						int x = i-1;
						while (arr[i][j]==temp && x>=0)
						{
					
							if(arr[x][j]==arr[i][j])
							{
								arr[i][j]+=arr[i][j];
								arr[x][j]=0;
							}
							if(arr[x][j]!=0){x-=4;}
							x--;
						}
					}
				}
			}
		}//
		
		
		
		//output
		for (int i=0; i<4; i++)
		{
			if (i!=0)
			System.out.println();
			for (int j=0; j<4; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
		}
		sc.close();
		

	}

}
