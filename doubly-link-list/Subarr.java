import java.util.*;
public class Subarr{
     public static int maxFrequency(int[] arr, int k) {
        Arrays.sort(arr);
        int l=0;
        int r=0;
        long sum=0;
        int max=0;
        while(r<arr.length){
            sum+=arr[r];
            long targetSum=((long)arr[r] * (r-l+1));

            while(targetSum-sum>k){
                sum-=arr[l];
                l++;
                targetSum-=(arr[r] * (r-l+1));
            }
            max=Math.max(max,r-l+1);
            r++;

        }
        return max;
        
    }
    public static void main(String args[]){
        int arr[]={1,4,2,6,7,8,9};
        System.out.print(maxFrequency(arr,5));
    }
}