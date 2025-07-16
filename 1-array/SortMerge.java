public class SortMerge {
    public static void sort(int arr1[],int m,int arr2[],int n){
        int idx=m+n-1;
        int i=m-1;
        int j=n-1;
        while(i>=0  && j>=0){   
            if(arr1[i]>arr2[j]){
                arr1[idx--]=arr1[i--];
            }
            else{
                arr1[idx--]=arr2[j--];
            }
        }
        while(j>=0){  //arr1-> 4 ,5,6, arr2=> 1,2,3
            arr1[idx--]=arr2[j--];
        }

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr1[]={1,2,4,5};
        int arr2[]={6,7,8,9};
        sort(arr1,arr1.length,arr2,arr2.length);
        printArray(arr1);   
    }
    
}
