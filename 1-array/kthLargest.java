import java.util.*;
public class kthLargest {
    public static void findkthlargest(int arr[],int k){
        Arrays.sort(arr);
        int n=arr.length;
        int idx=k;
        for(int i=n-1;i>=0;i--){
            while(i>0 && arr[i]==arr[i-1])
            i--;

            idx++;
            if(i==k){
                System.out.println(arr[idx]);
                break;
            }

            
        }


    }
    public static void main(String args[]){
        int arr[]={2,1,4,3,5,8,6,5,4,3};
        findkthlargest(arr, 2);

    }
    
}
