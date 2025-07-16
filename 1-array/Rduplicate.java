import java.util.*;
public class Rduplicate {
    public static void removeD(int arr[]){
        int n=arr.length;
        int result[]=new int[n];
        Arrays.sort(arr);
        int temp=0;
        for(int i=0;i<n;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                result[temp]=arr[i];
                temp++;

            }
        }
       for(int i=0;i<temp;i++){
        System.out.print(result[i]);
       }
    }
   
    public static void main(String args[]){
        int arr[]={1,3,4,3,6,2};
        removeD(arr);
       
    }
    
}
