import java.util.Scanner;
public class leapyear{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter  year : ");
        int year = in.nextInt();
        if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
{
            System.out.println(year + " is leap year.");
        }else{
            System.out.println("This is is not leap year.");
        }

    }
    
}
