public class Mergetwosortedarr{
    public static void merging(int arr[],int m,int arr2[],int n){
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0 && j>=0){
            if(arr[i]>arr2[j]){
                arr[idx--]=arr[i--];

            }
            else{
                arr[idx--]=arr2[j--];
            }
        }
        while(j>=0){
            arr[idx--]=arr2[j--];
        }
       
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i] +" ");
        }
    }
    public static void main(String args[]){
        int arr[]={2,3,4,0,0,0};
        int arr2[]={4,6,7};
       
        merging(arr,3,arr2,arr2.length);
        printArray(arr);
    }
}
