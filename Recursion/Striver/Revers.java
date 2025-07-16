public class Revers {
    public static void swap(int arr[],int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }
    public static void rev(int arr[],int l){
        int n=arr.length;
        if(l>=(n/2)){
            return;
        }
        swap(arr,l,n-l-1);
        rev(arr,l+1);
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rev(arr,0);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    
}
