public class Rotate {
    public static void rotate(int arr[],int k){
        int temp[]=new int[k];
        for(int i=0;i<k;i++){
            temp[i]=arr[i];
        }
        for(int i=k;i<arr.length;i++){
            arr[i-k]=arr[i];
        }
        int j=0;
        for(int i=arr.length-k;i<arr.length;i++){
            arr[i]=temp[j++];

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

       }

    public static void main(String args[]){
        int arr[]={2,1,3,4};
        int k=1;
        rotate(arr,k);
    }
    
}
