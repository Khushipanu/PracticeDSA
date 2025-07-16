//found or not
public class FoundorNot {
    public static boolean found(int target,int arr[],int idx){
        if(idx==arr.length){
            return false;

        }
        if(arr[idx]==target){
            return true;
        }
        else{
            return found(target,arr,idx+1);
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        if(found(5,arr,0)){
            System.out.println("found");
        }
        else{
            System.out.println("not found");
        }

    }
    
}
