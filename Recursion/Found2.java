public class Found2 {
    public static int findingNumber(int arr[],int idx,int target){
        if(idx==arr.length-1 ){
            return -1;
        }
        if(arr[idx]==target){
            return idx;
        }
        else{
            return findingNumber(arr,idx+1,target);
        }
    }
  
 public static void main(String args[]){
    int arr[]={4,14,3,6,2,8,9};
    int ans=findingNumber(arr, 0, 14);
    System.out.println(ans);
    
 } 
    
    
}
