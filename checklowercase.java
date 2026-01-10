import java.util.Scanner;
public class checklowercase {
      public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter character : ");
        char ch = sc.next().trim().charAt(0);
        if(ch>='a' && ch<='z'){                            // we compare char because they have acs value 
            System.out.println("it is a lowercase");
        }
        else{
            System.out.println("it is an uppercase");
        }
    }
    
}
