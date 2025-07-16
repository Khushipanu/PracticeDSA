import java.util.*;
public class SecondBetter {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,7,6,8};
        int max=arr[0];
        int s_max=-1;
        int n=arr.length;

        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=0;i<n;i++){
            if(arr[i]>s_max && arr[i]!=max){
                s_max=arr[i];
              
            }
        }
        System.out.println(s_max+"");
    }
    
}
