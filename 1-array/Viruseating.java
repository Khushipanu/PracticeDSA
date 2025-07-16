import java.util.Scanner;

public class Viruseating {
    // public static void viruseating(int arr[],int k){
     
    //     for(int i=0;i<arr.length;i++){
    //         System.out.println(arr[i]>>k);  
    //     }

    // }
    // public static void main(String[] args) {
    //     int arr[]={5,1,2,3,4,5,2};
    //     viruseating(arr, 2);

        
    // }
      public static void main(String[] args) {
       int arr[]={5,1,2,3,4,5,2};
       int k=2;
        for (int i: arr) {
            System.out.print((i >> k));
            System.out.print(" ");
        }
    }
    
}
