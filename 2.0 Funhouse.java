import java.util.Scanner;

public class Funhouse {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		int house= 1;
		while (sc.hasNext())
		{
			 int m = sc.nextInt();
			 int n = sc.nextInt();
			 if(m==0 && n==0)
			 {
				 break;
			 }
			 char[][] grid = new char[n][m];
			 int x=-1,y=-1;
			 char direction;
			 
			 sc.nextLine();
			 for (int i=0; i<n; i++)
			 {
				 String temp = sc.next();
				 for(int j=0; j<m; j++)
				 {
					 grid[i][j] = temp.charAt(j);
					 if (grid[i][j]=='*')
					 {
						 x=i;
						 y=j;		 
					 }
				 }
			 }
			 
			 
			 
			 if (y==0) direction = 'e';
			 else if (y==m-1) direction = 'w';
			 else if (x==0) direction = 's';
			 else direction = 'n';
			 
			 boolean exit = false;
			 while (!exit)
			 {
				// System.out.println(x + " " + y + " " + direction);
				 switch (direction)
				 {
				 case 'n':	x--;
				 			if(grid[x][y]=='\\') {
				 				direction = 'w';
				 			}
				 			if (grid[x][y]=='/') {
				 				direction = 'e';
				 			}
				 			break;
				 case 'e':	y++;
						 	if(grid[x][y]=='\\') {
				 				direction = 's';
				 			}
				 			if (grid[x][y]=='/') {
				 				direction = 'n';
				 			}	
				 			break;
				 case 's': x++;
						 	if(grid[x][y]=='\\') {
				 				direction = 'e';
				 			}
				 			if (grid[x][y]=='/') {
				 				direction = 'w';
				 			}
				 			break;
				 case 'w': y--;
						    if(grid[x][y]=='\\') {
				 				direction = 'n';
				 			}
				 			if (grid[x][y]=='/') {
				 				direction = 's';
				 			}
				 			break;
					 
				 }
				 
				 if (grid[x][y]=='x')
				 {
					 grid[x][y] = '&';
					 exit =true;
				 }
			 }
			 
			 
			 System.out.print("HOUSE " + house);
			 for (int i=0; i<n; i++)
			 {
				 System.out.println();
				 for(int j=0; j<m; j++)
				 {
					 System.out.print(grid[i][j]);
				 }
			 }
			 System.out.println("");
			 house++;
		}

	}

}
