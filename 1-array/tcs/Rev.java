public class Rev {
    public static void rev(int arr[]){
        int n=arr.length;
        int i=0;
        int j=n-1;
        while(i<=j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        for(int k=0;k<n;k++){
            System.out.println(arr[k]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,3,5,2,6};
        rev(arr);
    }
    
}
