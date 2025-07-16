import java.util.*;
//wrng nahi aata

public class KthHighest {
    public static void swap(int arr[],int a,int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;

    }
    public static void reverse(int arr[]){
        int s=arr[0];
        int e=arr.length-1;
        while(s<=e){
            swap(arr,s,e);
            s++;
            e--;
    }
    }

    public static void main(String[] args) {
        int arr[]={1,4,7,5,5,1};
        int temp[]=new int[arr.length];
        int k=3;
        Arrays.sort(arr);
        reverse(arr);

       for(int i=0;i<arr.length;i++){
        while(arr[i]==arr[i+1]){
            i++;
            temp[i]=arr[i];

        }


       }

    }


    
}
