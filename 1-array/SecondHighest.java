import java.util.*;
public class SecondHighest {
    public static void main(String[] args) {
        int arr[]={1,2,3,5,2,8,6};
        int n=arr.length;
        Arrays.sort(arr);
        int s_max=0;
        for(int i=n-2;i>=0;i--){
            if(arr[i]!=arr[n-1]){
                s_max=arr[i];
                break;
            }
        }
        System.out.println(s_max);
    }
    
}
