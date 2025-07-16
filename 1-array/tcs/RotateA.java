public class RotateA{
    public static void rotate(int arr[],int k){
        int n=arr.length;
        k=k%n;
        int temp[]=new int[n];
        int p=0;
        for(int i=n-k;i<=n-1;i++){
            temp[p++]=arr[i];

        }
        for(int i=0;i<n-k;i++){
            temp[p++]=arr[i];
        }
        for(int i=0;i<temp.length;i++){
            System.out.println(temp[i]);
        }

    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rotate(arr,2);
    }
}