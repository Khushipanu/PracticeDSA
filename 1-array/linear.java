import java.util.*;
public class linear {
    public static int search(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n;i++){
         
            if(arr[i]==target){
                System.out.println("found");
                return i;
            }
        
        }
       
        return -1;
    }
    public static void main(String args[]){
        int arr[]={1,4,2,7,5};
        System.out.print(search(arr,4));
    }
    
}
