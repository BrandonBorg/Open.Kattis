import java.util.Scanner;

public class irepeatmyself {
	static public void main(String[] args)
	{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for (int x=0; x<n; x++)
		{
			String input = sc.nextLine();
			input= input+input;
			String pleb = ""+input.charAt(0);
			boolean check =false;
			boolean ze=false;
			for(int i=1;i<=input.length()/2;i++)
			{
				
					int j=0;
					check=true;
					while (j<input.length()/2)
					{
						//System.out.println(input.substring(j,j+pleb.length()));
						
						if (j+pleb.length()>input.length()/2)
						{
							int len = j+pleb.length()-(input.length()/2);
							//System.out.println(pleb.substring(0,pleb.length()-len));
							if(!pleb.substring(0,pleb.length()-len).equals(input.substring(j, j+pleb.length()-len))) {
							check=false;
							break;
							}
						}
						else if (!pleb.equals(input.substring(j, j+pleb.length())))
						{
							//System.out.println(pleb.substring(0,pleb.length()));
							check=false;
							break;
						}
						j+= pleb.length();
					}
					if (check)
					{
						System.out.println(pleb.length());
						ze=true;
						break;
					}
					pleb+=input.charAt(i);
						
					
			}
			
		}
	}
}

