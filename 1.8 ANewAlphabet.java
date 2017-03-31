import java.util.HashMap;
import java.util.Scanner;

public class ANewAlphabet {
	public static void main(String[] args){
		Scanner sc= new Scanner (System.in);
		String input = sc.nextLine();
		String ans="";
		input = input.toLowerCase();
		HashMap<Character, String> map = new HashMap<>();
		map.put('a', "@"); map.put('b', "8");
		map.put('c', "("); map.put('d', "|)");
		map.put('e', "3"); map.put('f', "#");
		map.put('g', "6"); map.put('h', "[-]");
		map.put('i', "|"); map.put('j', "_|");
		map.put('k', "|<"); map.put('l', "1");
		map.put('m', "[]\\/[]");map.put('n', "[]\\[]");
		map.put('o', "0"); map.put('p', "|D");
		map.put('q', "(,)"); map.put('r', "|Z");
		map.put('s', "$"); map.put('t', "']['");
		map.put('u', "|_|"); map.put('v', "\\/");
		map.put('w', "\\/\\/"); map.put('x', "}{");
		map.put('y', "`/"); map.put('z', "2");
		int length=input.length();
		for (int i=0; i<length;i++)
		{
			char temp = input.charAt(i);
			if (map.containsKey(temp))
			{ans += map.get(temp);}
			else ans+=temp;
			
		}
		System.out.println(ans);
    sc.close();
	}
}
