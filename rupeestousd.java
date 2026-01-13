import java.util.Scanner;
public class rupeestousd {
    public static void main(String[] args){
        double rupees,usd;
    System.out.print("Enter Indian Rupees : ");
    Scanner sc = new Scanner(System.in);
    rupees = sc.nextDouble();
    usd = rupees/90.0;
    System.out.println("indian rupees in usd is : " +usd); 
    }
}