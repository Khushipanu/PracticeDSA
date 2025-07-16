import java.util.*;
public class ArrayKthRotate {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int k=2;
        int temp[]=new int[k];   //yaha pe k elements hi to rhenge na that means 2 element

       
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=n-k;i<n;i++){
            arr[i]=temp[j];
            j++;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    
}
