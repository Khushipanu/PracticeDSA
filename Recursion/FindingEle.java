public class FindingEle {
    public static int findingele(int arr[],int idx,int k){
        if(arr[idx]==k){
            return idx;
        }
        return findingele(arr,idx+1,k);
    }
    public static void main(String args[]){
        int arr[]={1,2,4,5,3,6,7,5};
        System.out.println(findingele(arr,0,5));
    }
    
}
