import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Towering {
	static int[] boxes = new int[6];
	static int[] stack1 = new int[3];
	static int h1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int[] stack2 = new int[3];
		
		for (int i=0; i<6; i++)
		{
			boxes[i]=sc.nextInt();
		}
		
		h1=sc.nextInt();
		int h2=sc.nextInt();
		Arrays.sort(boxes);
		find();
		int boxnum2=0;
		for (int i=5; i>=0;i--)
		{
			if(!(boxes[i]==stack1[0] || boxes[i]==stack1[1] || boxes[i]==stack1[2] )&&boxnum2<3) {
				stack2[boxnum2]=boxes[i];
				boxnum2++; 
			}
			
		}
		for (int i=0; i<3; i++)
		{
			System.out.print(stack1[i] + " ");
		}
		for (int i=0; i<3; i++)
		{
			System.out.print(stack2[i] + " ");
		}


	}
	static void find() {
		for (int i=5; i>=2 ; i--)
		{
			for (int j=i-1; j>=1;j--)
			{
				for (int y = j-1; y>=0; y--)
				{
					if (boxes[i]+boxes[j]+boxes[y] ==h1)
					{
						
						stack1[0]=boxes[i];
						stack1[1]=boxes[j];
						stack1[2]=boxes[y];
						return;
					}
				}
			}
		}
	}
	
}
