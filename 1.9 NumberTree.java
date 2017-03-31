import java.util.Scanner;

public class NumberTree {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	long height =sc.nextInt();
	String s= " ";
	if (sc.hasNext()){
	 s = sc.next();}
	long subtract=0;

	long ans = (long)Math.pow(2, height+1);
     ans --;
	
	for (int i=0; i<s.length(); i++)
	{
		
	     char temp = s.charAt(i);
	     if (temp == 'L')
	     {
	    	 subtract=  2* subtract+1;
	     }
	     if (temp == 'R')
	     {
	    	 subtract = 2 * subtract +2; 
	     }
	}
	
	
	System.out.println(ans - subtract);
	sc.close();
	
	}
}
