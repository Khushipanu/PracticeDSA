import java.util.*;
public class Maxsubarraysum {
    public static void maxsubarray(int arr[]){
        int n=arr.length;
        int max=-1;
        int currSum=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                currSum=0;
              for(int k=i;k<=j;k++){
                 currSum +=arr[k];
              }
              if(currSum>max){
                max=currSum;
              }
            }
        }
        System.out.println("max is:" +max);
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        maxsubarray(arr);
    }

    
    
}
