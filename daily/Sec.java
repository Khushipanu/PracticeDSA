import java.util.*;
public class Sec {
    public static int max(int arr[]){
        if(arr.length<2){
            return -1;
        }
        int s_max=0;
         for(int i=arr.length-2;i>=0;i--){
            if(arr[i]!=arr[i+1]){
                s_max=arr[i];
                return s_max;
            }

        }
        return  0;
    }
     public static void main(String args[]){
        int s_max=0;
        int arr[]={1,4,2,8,7,7,7,5,8,5};
        Arrays.sort(arr);  //1 2 4 5 7 7 7 8 
       System.out.println( max(arr));
       
       
       

    }
    
}
