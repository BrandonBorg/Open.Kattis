import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

import java.util.Stack;

public class robotsonagrid {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader sc= new BufferedReader(new InputStreamReader(System.in)); // Used buffered reader to make it faster
		
		Queue<point> q = new LinkedList<point>();
		
		int n =Integer.parseInt(sc.readLine());
		int g=0;
		
		int [][] grid = new int[n][n]; // the input grid
		long [][] value = new long[n][n]; //this array stores the amount of paths to a certain point 
		value[0][0]=1;
		
		//Read in input
		for (int i=0; i<n; i++)
		{
			String in = sc.readLine();
			g=0;
			for (int j=0; j<in.length(); j++)
			{
				if (in.charAt(j)=='.'){ grid[i][j]=1; g++;}
			}
			if (g==0) break; // if we encounter a row full of blocks break
				
		}
		//EOF input
		
	// BFS of total amount of paths from start to end
	if( g==0 || grid[n-1][n-1]==0) System.out.println("INCONCEIVABLE"); // Shortcuts to help optimize
	else
	{
			Stack<point> s = new Stack<point>();		
			q.add(new point(0,0));
			long output=0;
			long moded =(long) (Math.pow(2, 31)-1);

			while (!q.isEmpty())
			{
				point temp = q.remove();
				if(temp.x == n-1 && temp.y == n-1)
				{
					value[temp.x][temp.y]=(value[temp.x][temp.y] +((value[temp.x2][temp.y2])) % moded) ;
					
				}
				else {
					if(temp.x<0 || temp.y<0 || temp.x>=n || temp.y>=n || grid[temp.x][temp.y]==0) {} //checking for bounds or obstacles 
					else {
						
						if(	grid[temp.x][temp.y]==-1)
						{		
							value[temp.x][temp.y]=(value[temp.x][temp.y]+value[temp.x2][temp.y2])% moded ; //Previous value + current value
						}else
						{
							value[temp.x][temp.y]=value[temp.x2][temp.y2] % moded; // if current value was never visited just set value (not really needed but its how I implemented this)
						    grid[temp.x][temp.y]=-1;
							q.add(new point(temp.x,temp.y+1,temp.x,temp.y ));		// add point to the right to queue
							q.add(new point(temp.x+1, temp.y,temp.x,temp.y ));		// add point to the left to queue
							
						}
					}
				}
			}
			
		//EOF BFS
			
		output=value[n-1][n-1]%moded; //output moded

		
		//DFS For finding a path if one exists
		s.add(new point(0,0));	//use stack for DFS
		
			if (output==0 )
			{
				s.add(new point(0,0));
				while(!s.isEmpty())
				{
					point temp = s.pop();
					if(temp.x == n-1 && temp.y == n-1 )
					{
						output=-1;
						break;
					}
					else {
						if(temp.x<0 || temp.y<0 || temp.x>=n || temp.y>=n || grid[temp.x][temp.y]==0 || grid[temp.x][temp.y] ==-2) {} //checking bounds
						else {
							grid[temp.x][temp.y]=-2;	// set to visited by DFS
							s.add(new point(temp.x,temp.y+1));		// 	check surroundings add to stack
							s.add(new point(temp.x+1, temp.y));
							s.add(new point(temp.x,temp.y-1));
							s.add(new point(temp.x-1, temp.y));
						}
					}
				}
			
			}
			//EOF DFS

			
			if(output>0)
			System.out.println(output);
			else if(output==0)
				System.out.println("INCONCEIVABLE");
			else if(output<0)
				System.out.println("THE GAME IS A LIE");
	
		}
	}
}
class point {
	//X Y store current point
	//X2 Y2 store previous point
	int x,y,x2,y2;
	
	point(int i, int j)
	{
		x=i;
		y=j;
		
	}
	point(int i, int j,int i2,int j2)
	{
		x=i;
		y=j;	
		x2=i2;
		y2=j2;
		
	}
}
