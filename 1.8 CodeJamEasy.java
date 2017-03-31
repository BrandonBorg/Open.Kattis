package codejam;

import java.util.Scanner;

public class CodeJamEasy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String[] arr =  new String[count+1];
		String line = sc.nextLine();
		for (int i=0; i<count; i++)
		{
			line = sc.nextLine();
			String ans =""+(find(line,0) % 10000);
			if(ans.length()>4){ans=ans.substring(ans.length()-4, ans.length());}
			if(ans.length()==1)ans = "000"+ans;
			if(ans.length()==2)ans="00" +ans;
			if(ans.length()==3)ans="0"+ans;
			arr[i]= ("Case #"+(i+1)+": "+ans);	
		}
		for (int i =0;i<count;i++)
		{
			System.out.println(arr[i]);
		}
		sc.close();
	}
	public static  int find(String str, int pos){
		String key = "welcome to code jam ";	

		
		if (pos == 19){return 1;}
		if(str.length()==0) return 0;
			if (str.charAt(0)==key.charAt(pos))
			{
				return find(str.substring(1),pos+1) + find(str.substring(1),pos);
						
			}
			return find(str.substring(1),pos);	
	}

}
