import java.util.Scanner;

public class SpeedLimit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int time = sc.nextInt();
		while (time!=-1)
		{
		int z = time;
		int prev=0, speed=0,hour=0,total=0,temp=0;
		
		for (int i=0;i<z;i++)
		{
			speed=sc.nextInt();
			hour=sc.nextInt();
			temp=hour;
			hour= hour-prev;
			total = total+ hour*speed;
			prev=temp;
	
		}
		System.out.println(total +" miles");
		time=sc.nextInt();
			
		}
		sc.close();
	}

}
