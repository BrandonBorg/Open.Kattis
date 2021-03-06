import java.util.HashMap;
import java.util.Scanner;

public class T9Spelling {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('a',2); map.put('b',22);map.put('c',222);
        map.put('d',3); map.put('e',33);map.put('f',333);
        map.put('g',4); map.put('h',44);map.put('i',444);
        map.put('j',5); map.put('k',55);map.put('l',555);
        map.put('m',6); map.put('n',66);map.put('o',666);
        map.put('p',7); map.put('q',77);map.put('r',777); map.put('s', 7777);
        map.put('t',8); map.put('u',88);map.put('v',888);
        map.put('w',9); map.put('x',99);map.put('y',999); map.put('z', 9999);
        map.put(' ', 0);
        int n = sc.nextInt();
        String word = sc.nextLine();
        for (int x=1; x<=n;x++)
        {
        String ans ="";
         word = sc.nextLine();
        int ln = word.length();
        for (int i=0;i<ln;i++)
        {
            char c = word.charAt(i);
            if (map.containsKey(c))
            {
                int temp2 = map.get(c);
                String temp = "" + temp2;
                temp = ""+ temp.charAt(0);
                if (i==0){ ans+= map.get(c);}
                else if(map.containsKey(c))
                {
                    if (ans.endsWith(temp)){ ans += " " + map.get(c);}
                    else {ans+=map.get(c);}
                }else ans+=c;
                
                
            }
        }
        sc.close();
        System.out.println("Case #" + x + ": " + ans);
        }
    }   
}
