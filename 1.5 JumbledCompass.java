import java.util.Scanner;

public class JumbledCompass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n1 =sc.nextInt();
		int n2 =sc.nextInt();
		int ans=0;
	     if (n2>n1){
			int temp2= n1+360-n2;
			int temp1 = n2-n1;
			if (temp1<temp2){ ans =temp1;}
			else if (temp1==temp2){ans =temp1;}
			else ans= ans-temp2;		
		}
		if (n1>n2){
			int temp1= n2+360-n1;
			int temp2 = n1-n2;
			if (temp1<temp2){ ans =temp1;}
			else if (temp1==temp2){ans =temp1;}
			else ans= ans-temp2;		
		}
	  sc.close();
		System.out.println(ans);
	}

}
