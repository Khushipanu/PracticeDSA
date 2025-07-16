public class SelectionSort {
    public static void selectionSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;

    }
    }
    public static void main(String args[]){
        int arr[]={1,4,3,5,6,2};
        selectionSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    
}
