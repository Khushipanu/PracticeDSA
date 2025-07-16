import java.util.*;
public class Maxiim {
    public static int maxrecursion(int arr[],int idx){
        int n=arr.length;
        if(idx==n-1){
            return arr[idx] ;

        }
        return Math.max(arr[idx],maxrecursion(arr,idx+1));

    }
    public static void main(String args[]){
        int arr[]={1,2,4,3,5,6,2};
        System.out.println(maxrecursion(arr,0));
    }

    
}



