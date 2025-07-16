import java.util.*;
public class RemoveD {
    public static void removeduplicate(int arr[]){
        int n=arr.length;
        Arrays.sort(arr);   //1,2,2,3,4
        
        int ans[]=new int[n];
        int k=0;
        for(int i=0;i<n;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                ans[k++]=arr[i];
            }
        }
        for(int i=0;i<k;i++){
            System.out.println(ans[i]);
        }
    }

    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,2};
        removeduplicate(arr);

    }
    
}
