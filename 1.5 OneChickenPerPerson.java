import java.util.Scanner;

public class OneChickenPerPerson {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
	int people = sc.nextInt();
	int chicken = sc.nextInt();
	
	int ans = chicken - people;
	if (ans>1)
	{
		System.out.println("Dr. Chaz will have " + ans + " pieces of chicken left over!");
	}
	else if (ans==1)
	{
		System.out.println("Dr. Chaz will have " + ans + " piece of chicken left over!");	
	}
	else if (ans == -1) { 
		ans = Math.abs(ans);
		System.out.println("Dr. Chaz needs "+ ans + " more piece of chicken!");
	}else{
		ans = Math.abs(ans);
		System.out.println("Dr. Chaz needs "+ ans + " more pieces of chicken!");
	}
	sc.close();
	}

}
