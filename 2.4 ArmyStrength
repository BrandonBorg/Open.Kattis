
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.StringTokenizer;

public class ArmyStrength {
    public static void main(String[] args)
    {
        FastReader s=new FastReader();

        int t =s.nextInt();
        for (int gg=0; gg<t;gg++)
        {
            int g=0, m=0;
            int x=s.nextInt();
            int y=s.nextInt();
            for (int i=0;i<x;i++)
            {
                int temp =s.nextInt();
                if (temp>g){
                    g=temp;
                }
                if (temp==1000000000){i=i+x;}
            }
            for (int i=0; i<y;i++)
            {
                int temp=s.nextInt();
                if (temp>m){
                    m=temp;
                }
                

            }
            if (m==g){System.out.println("Godzilla");}
            else if(g>m){System.out.println("Godzilla");}
            else {System.out.println("MechaGodzilla");}
            
            
        }
    }
    static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
}
