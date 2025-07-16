import java.util.*;
public class kedans {
    public static void kedans(int arr[]){
        int n=arr.length;
        int currSum=0;
        int maxSum=-1;
        for(int i=0;i<n;i++){
            currSum+=arr[i];
            if(currSum<0){
                currSum=0;
            }
            if(currSum>maxSum){
                maxSum=currSum;
            }

        }
        System.out.println(maxSum);

    }
    public static void main(String[] args) {
        int arr[]={1,-2,6,-1,3};
        kedans(arr);
    }
    
}
