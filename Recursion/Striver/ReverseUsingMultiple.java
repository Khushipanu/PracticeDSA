public class ReverseUsingMultiple {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void fun(int arr[],int l,int r){
        if(l>=r){

            return;
        }
        swap(arr,l,r);
        fun(arr,l+1,r-1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        fun(arr,0,arr.length-1);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
