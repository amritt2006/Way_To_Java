import java.util.Scanner;
public class calculator {
    public static void main(String[] args){
        int num1,num2, ans;
        char op;
        ans=0;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.print("Enter First Number : ");
        num1 = in.nextInt();
        System.out.print("Enter operator : ");
        op = in.next().trim().charAt(0);
        System.out.print("Enter second number : ");
        num2 = in.nextInt();
        if(op =='+'|| op =='-'|| op == '*'|| op == '/'||op == '%'){
            if(op=='+'){
                ans=num1+num2;
            }
            if(op=='-'){
                ans=num1-num2;
            }
            if(op=='*'){
                ans=num1*num2;
            }
            if(op=='/'){
                if(num2==0){
                    System.out.println("invalid num2.");
                    break;
                }else{
                    ans=num1/num2;
                }
            }
            if(op=='%'){
                ans=num1%num2;
            }
        } else if(op=='x'||op=='X'){
            System.out.println("invalid operator");
                break;
            }else{
                System.out.println("choose valid operator.");
            }
            System.out.println("ans of " +num1 + " " +op +" "+num2+ " " + "is " +ans);
        }
    }    
}
