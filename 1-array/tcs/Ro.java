public class Ro {
    public static void rotate(int arr[],int k){
        int n=arr.length;
        int temp[]=new int[n];
        for(int i=0;i<=k-1;i++){  //1 1 2
            temp[i]=arr[i];
        }
        for(int i=k;i<n;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=k+1;i<n;i++){
            arr[i]=temp[j++];
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
       
    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rotate(arr,2);
    }
    
}
