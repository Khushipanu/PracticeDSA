public class Binar{
    public static boolean search(int arr[],int target){
        int n=arr.length;
        int left=0;
        int right=n-1;
        while(left<=right){
            int mid=(left+right) /2;
            if(arr[mid]==target){
                return true;
            }else if(arr[mid]>target){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;

    }
    public static void main(String args[]){
        int arr[]={1,4,6,8,19};
        System.out.print(search(arr,8));
        
    }
}