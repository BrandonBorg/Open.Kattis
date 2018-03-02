import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Coast {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Queue<sea> q = new LinkedList<sea>();
		int n = sc.nextInt();
		int m = sc.nextInt();
		char coast[][][] = new char[n][m][2];
		int coastlength = 0;
		
		
		sc.nextLine();
		for(int i=0; i<n; i++)
		{
			String temp=sc.nextLine();
			
			for(int j=0; j<temp.length(); j++)
			{	
				coast[i][j][0] = temp.charAt(j);
				coast[i][j][1] = '0';
				
			}
		}
		
		
			//top
			for(int j=0; j<m; j++) 
			{
				if(coast[0][j][0]=='1' &&coast[0][j][1]=='0')
				{
					coastlength++;
				}
				else if(coast[0][j][0]=='0' && coast[0][j][1]=='0') {
					q.add(new sea(0, j));
				}
				
					
			}
			
			//bottom
			for(int j=0; j<m; j++) 
			{
				if(coast[n-1][j][0]=='1' &&coast[n-1][j][1]=='0')
				{
					coastlength++;
				}
				else if(coast[n-1][j][0]=='0' && coast[n-1][j][1]=='0') {
					q.add(new sea(n-1, j));
				}
					
			}
			
			//left
			for(int i=0; i<n; i++) 
			{
				if(coast[i][0][0]=='1' &&coast[i][0][1]=='0')
				{
					coastlength++;
				}
				else if(coast[i][0][0]=='0' && coast[i][0][1]=='0') {
					q.add(new sea(i, 0));
				}
			}
			
			//right
			for(int i=0; i<n; i++) 
			{
				if(coast[i][m-1][0]=='1' &&coast[i][m-1][1]=='0')
				{
					coastlength++;
				}
				else if(coast[i][m-1][0]=='0' && coast[i][m-1][1]=='0') {
					q.add(new sea(i, m-1));
				}
			}
					
			
			
			//queue
			
			while(!q.isEmpty())
			{
				sea temp = q.remove();
				//check top
			if(coast[temp.x][temp.y][1]=='0')
			{	
				if (temp.y !=0)
				{
					if (coast[temp.x][temp.y-1][0] == '1') {
						coastlength++;
					}else if(coast[temp.x][temp.y-1][0] == '0'&& coast[temp.x][temp.y-1][1] == '0')
							{
								q.add(new sea(temp.x, temp.y-1));
							}
				}
				//check bottom
				if (temp.y != m-1)
				{
					if (coast[temp.x][temp.y+1][0] == '1') {
						coastlength++;
					}else if(coast[temp.x][temp.y+1][0] == '0'&& coast[temp.x][temp.y+1][1] == '0')
							{
								q.add(new sea(temp.x, temp.y+1));
							}
				}
				//check right
				if (temp.x !=n-1)
				{
					if (coast[temp.x+1][temp.y][0] == '1') {
						coastlength++;
					}else if(coast[temp.x+1][temp.y][0] == '0'&& coast[temp.x+1][temp.y][1] == '0')
							{
								q.add(new sea(temp.x+1, temp.y));
							}
				}
				//check left TODO
				if (temp.x !=0)
				{
					if (coast[temp.x-1][temp.y][0] == '1') {
						coastlength++;
					}else if(coast[temp.x-1][temp.y][0] == '0'&& coast[temp.x-1][temp.y][1] == '0')
							{
								q.add(new sea(temp.x-1, temp.y));
							}
				}
				coast[temp.x][temp.y][1]='1';
			}		
			}
			System.out.println(coastlength);
		
	
		
	}

	static class sea {
		int x,y;
		sea(int i, int j)
		{
			x=i;
			y=j;
				
		}
	}
}
