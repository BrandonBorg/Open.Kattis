package prva;

import java.util.Scanner;

public class Prva{

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		String ans = "zzzzzzzzzzzzzzzzzzzz";

		char[][] arr = new char[r][c];
		for (int i = 0; i<r; i++){
			String x = sc.next();
			for (int j=0; j<c; j++){
				arr[i][j] = x.charAt(j);
				
			}
		}
		sc.close();
		//small c
		for (int i=0;i<r;i++)
		{
			String temp="";
			
			for(int j=0;j<c;j++)
			{
				if (j==c-1 && arr[i][j] !='#'){temp+=arr[i][j];}
				if (arr[i][j] == '#'|| j== c-1 )
				{
					if(temp.length()>1 && ans.compareTo(temp)>0){
						ans = temp;
					}
					temp="";
				}else{ temp += arr[i][j]; }
			
			}
		}
		for (int i=0;i<c;i++)
		{
			String temp="";
			
			for(int j=0;j<r;j++)
			{
				if (j==r-1 && arr[j][i] !='#'){temp+=arr[j][i];}
				if (arr[j][i] == '#'|| j== r-1 )
				{
					if(temp.length()>1 && ans.compareTo(temp)>0){
						ans = temp;
					}
					temp="";
				}else{ temp += arr[j][i];}
			
			}
		}
		
		System.out.println(ans);
	}

}
