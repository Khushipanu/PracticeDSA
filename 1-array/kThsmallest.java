import java.util.*;
public class kThsmallest{
    public static void findSecondSmallest(int arr[],int k){
        Arrays.sort(arr);
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(i<n && arr[i]==arr[i+1] )
            i++;

            k--;
            if(k==0){
                System.out.println(arr[i]);
                break;
            }
        }
    }
    public static void main(String args[]){
        int arr[]={1,4,2,4,2,8,9,6,4};
        findSecondSmallest(arr, 3);


    }
    
}