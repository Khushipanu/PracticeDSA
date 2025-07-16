public class Indices {
    public static void indiceswithtarget(int arr[],int target,int idx){
        if(idx==arr.length){
            return ;
        }
        if(arr[idx]==target){
            System.out.println(idx);
        }
        indiceswithtarget(arr,target,idx+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,2,5};
        indiceswithtarget(arr, 2, 0);

    }
    
}
