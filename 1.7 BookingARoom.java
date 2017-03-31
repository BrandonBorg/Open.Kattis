import java.util.Scanner;

public class BookingARoom {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int n = sc.nextInt();
		boolean[] booked = new boolean[r+1];
		for (int i=0;i<n;i++)
		{
			int num = sc.nextInt();
			booked[num]=true;
		}
		
		sc.close();
		
		if (r==n)
		{
			System.out.println("too late");
		}else
		{
			for (int i=1; i<r+1;i++){
				if (booked[i]==false){
					System.out.println(i);
					break;
				}
			}
		}
		
		
	}
}
