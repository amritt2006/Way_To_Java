// first type 
// public class repeatingno {
//     public static void main(String [] args){
//         int arr[] = {1,3,8,5,7,5,7,8,7,9};
//         int i,count;
//         count=0;
//         for(i=0; i<arr.length; i++){
//             if(arr[i]==7){
//                 count++;
//             }
//         }
//         System.out.print(count);

        
//     }  
// }

//second type
/*public class repeatingno {

    public static void main(String[] args) {
        int num = 1385757879;
        int count = 0;
        String str = String.valueOf(num);
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='7'){
                count++;
            }
        }
        System.out.println(count);
        
    }
}*/
//third type
// 
//using while loop
public class repeatingno {

    public static void main(String args[]){
        int  num,count,ans;
        num = 1385757879;
        count=0;
        while(num>0){
            ans=num%10;
            if(ans==7){
                count++;
            }
            num=num/10;
        }
        System.out.println(count);
        
    }
}