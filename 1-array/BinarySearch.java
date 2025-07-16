import java.util.*;
public class BinarySearch {
    public static int search(int arr[],int target){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==target){
                System.out.println("found");
                return target;
            }
            else if(arr[mid]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }


        }
        return -1;

    }

    public static void main(String args[]){
        int arr[]={1,2,3,5,6};
        System.out.println(search(arr,5));
       

    }
    
}
