import java.util.Scanner;
public class switch_fruits{
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in );
      System.out.print("Enter fruit :");
      String fruit = sc.nextLine();
      switch (fruit) {
        case "Mango":
            System.out.println("King of fruit");
            break;
            case "Banana":
            System.out.println("Big yellow fruit");
            break;
            case "Apple":
            System.out.println("Good red fruit");
            break;
        default:
        System.out.println("Enter valid fruit!!");
            break;
      }   
    }
    
}
