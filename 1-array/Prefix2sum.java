import java.util.*;
public class Prefix2sum {
   
    public static void maxprefixSum(int arr[]){
        int n=arr.length;
        int max=0;
        int pref[]=new int[n];
        pref[0]=arr[0];
        for(int i=1;i<n;i++){
           pref[i]=pref[i-1] + arr[i];
        }
        int currSum=0;
        for(int i=0;i<n;i++){
            int start=i;
            for(int j=i;j<n;j++){
                int end=j;
                if(start<=0){
                    currSum=pref[end];
                }
               else{
                currSum=pref[end] - pref[start-1];
               }
               if(max<currSum){
                max=currSum;

               }
            }
        }
        System.out.println(max);
      

    }
   
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        maxprefixSum(arr);
    }

    
}

    
