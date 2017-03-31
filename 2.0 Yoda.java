import java.util.Scanner;
public class Yoda {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		String first = sc.next();
		String second = sc.next();
		sc.close();
		String one="",two="";
		
		if (first.length()>second.length()){
			for (int i=second.length();i<first.length();i++){
				second ='0' + second;
			}
		}
		else if(first.length()<second.length()){
			for (int i=first.length();i<second.length();i++){
				first ='0'+first;
			}
		}
		
		
		for (int i=0; i<first.length(); i++)
		{
			int comp1 = first.charAt(i);
			int comp2 = second.charAt(i);	
			if (comp1>comp2){one += first.charAt(i);}
			if (comp2>comp1){two += second.charAt(i);}
			if (comp1==comp2){one += first.charAt(i); two += second.charAt(i);}
					
		}
		
	
	    if (one==""){System.out.println("YODA");}
	    else if(Integer.parseInt(one)==0){one="0"; System.out.println(one);}
	    else {System.out.println(one);}
	    
	    if (two==""){System.out.println("YODA");}
	    else if( Integer.parseInt(two)==0){two="0"; System.out.println(two);}
	    else { System.out.println(two);}
		
		
			
		}
	
	}
