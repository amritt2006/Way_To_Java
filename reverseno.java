import java.util.Scanner;
public class reverseno {
    public static void main(String[] args){
        int n,r,i;
        r=0;
        n=23597;
        while(n>0){
            // r=n%10;
            // System.out.print(r);
            i=n%10;
            r=r*10+i;
            n/=10;
        }
        System.out.println(r);

    }
    
}
