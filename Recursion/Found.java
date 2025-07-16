public class Found {
    public static boolean findingNumber(int arr[],int idx,int target){
        if(idx==arr.length-1 ){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        else{
            return findingNumber(arr,idx+1,target);
        }
    }
  
 public static void main(String args[]){
    int arr[]={4,14,3,6,2,8,9};
    if(findingNumber(arr,0,0)){
        System.out.println("found");
    }
    else{
        System.out.println("not found");
    }
    
 } 
    
}
