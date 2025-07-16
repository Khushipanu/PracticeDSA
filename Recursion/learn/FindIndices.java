public class FindIndices {
    public static int findingIdx(int arr[],int x,int idx){
        if(idx==arr.length){
            return 0;
        }
        if(arr[idx]==x){
            System.out.println(idx);
        }
        return findingIdx(arr, x, idx+1);
       
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,2,5};
        findingIdx(arr,2,0);
    }
    
}
