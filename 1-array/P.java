import java.util.*;
public class P{  //remove duplicates
    public static void main(String args[]){
        int arr[]={1,2,4,2};
       Arrays.sort(arr);
       // 1 2 2 4
       int[] temp=new int[arr.length];
       int k=0;
       for(int i=0;i<arr.length;i++){
        if(i==0 || arr[i]!=arr[i-1]){
            temp[k++]=arr[i];
        }



       }
       for(int i=0;i<k;i++){
        System.out.println(temp[i]);

       }


    }
}