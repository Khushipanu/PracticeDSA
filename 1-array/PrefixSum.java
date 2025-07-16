import java.util.*;
public class PrefixSum {
    public static int [] prefixSum(int arr[]){
        int n=arr.length;
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
           pref[i]=pref[i-1] + arr[i];
        }
        return pref;

    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        int pref[]=prefixSum(arr);
        printArray(pref);
    }

    
}
