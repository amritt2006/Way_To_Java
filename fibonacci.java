import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("enter nth number: ");
        int nth = in.nextInt();
        int a = 0;
        int b = 1;
        int c; 
        for(int i = 2; i<=nth; i++){
            c=a+b;
            a=b;
            b=c;
        }
        System.out.println(b);
    }
    
}
