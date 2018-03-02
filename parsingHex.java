
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;


public class parsingHex {

	public static void main(String[] args) {

		ArrayList<Character> hLetters = new ArrayList<Character>();
		hLetters.add('A');
		hLetters.add('B');
		hLetters.add('C');
		hLetters.add('D');
		hLetters.add('E');
		hLetters.add('F');
		
		hLetters.add('a');
		hLetters.add('b');
		hLetters.add('c');
		hLetters.add('d');
		hLetters.add('e');
		hLetters.add('f');
		
		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()){
			
			boolean check0 =false;
			boolean checkx =false;
			String input = sc.nextLine();
			input+=" ";
			String hexOut ="";
			for(int i=0; i<input.length(); i++) {
				
				if(input.charAt(i)=='0') {
					check0= true;
					hexOut += '0';
				}else if(input.charAt(i)=='x' ||input.charAt(i)=='X'  )
				{
					if(hexOut.length()==1 && check0==true)
					{
						hexOut+=input.charAt(i);
						checkx=true;
					}
				}else if(hLetters.contains(input.charAt(i))) {
					if(checkx==true) {
						hexOut+=input.charAt(i);
					}
				}else if(Character.isDigit(input.charAt(i))) {
					if(checkx==true) {
					hexOut+=input.charAt(i);
					}
					
				}else {
					if(checkx == true)
					{
						if (hexOut.length()>2)
						{
						System.out.print(hexOut);
						String temp="";
						temp = hexOut.substring(2);
						BigInteger intOut = new BigInteger(temp, 16);
						System.out.println(" " + intOut);
						}
					}
					check0 = false;
					checkx = false;
					hexOut="";
				}
			}
			
		}
	}
	

}
