import java.util.Scanner;

public class ToiletSeat {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String seat = sc.next();
        char pos= seat.charAt(0);
        seat = seat.substring(1);
        int count= 0;
        //case one
        for (int i=0; i<seat.length();i++)
        {
            if (i==0 && pos=='D' )
            {
                count +=1;
            }
            else if (seat.charAt(i)=='D'){count+=2;}
            
        }
        System.out.println(count);
        count=0;
        //case two
        for (int i=0;i<seat.length();i++)
        {
            if (i==0&&pos=='U')
            {
                count +=1;
            }else if(seat.charAt(i)=='U'){count +=2;}
        }
        System.out.println(count);
        count=0;
        // case 3
        for (int i=0;i<seat.length();i++)
        {
            if (seat.charAt(i)!= pos){count+=1;}
            pos = seat.charAt(i);
        }
        System.out.println(count);
        sc.close();
        count=0;
    }
}
