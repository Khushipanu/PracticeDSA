public class ExistOrN {
    public static boolean existOrnot(int arr[],int target,int idx){
        if(idx==arr.length){
            return false;
        }
        if(arr[idx]==target){
            return true;
        }
        return existOrnot(arr,target,idx+1);

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        if(existOrnot(arr,9,0)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }

    }
    
}
