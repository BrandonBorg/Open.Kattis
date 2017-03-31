import java.util.Scanner;

public class StackingCups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int g = sc.nextInt();
		cups[] array = new cups[g];
		for (int i=0; i<g; i++)
		{
			int r;
			String c;
			if (sc.hasNextInt())
			{
				r = sc.nextInt()/2;
				c = sc.next();
			}else{
				c=sc.next();
				r=sc.nextInt();
			}
			cups cup = new cups(c, r);
			array[i]= cup;
		}
		for (int i=0; i<g; i++)
		{
			for (int j=i+1; j<g;j++)
			{
				if (array[j].radius<array[i].radius)
				{
					cups temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		 for (int i=0; i<g; i++)
		{
			 System.out.println(array[i].col);
		}
		 sc.close();
	}

}

	
class cups{
	String col;
	int radius;
	public cups(String s, int i)
{
	col=s;
	radius=i;
}
}
