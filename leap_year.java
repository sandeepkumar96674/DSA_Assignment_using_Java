import java.util.*;
public class leap_year {
    public static void main(String[] args) {
        Scanner in= new Scanner (System.in);
        System.out.print ("Enter the Year: ");
        int year=in.nextInt ();
        if (year!=0){
            if (year%4==0){
                System.out.println ("This is a leap year");
            }else{
                System.out.println ("The is not a leap year");
            }

        }


    }
}
