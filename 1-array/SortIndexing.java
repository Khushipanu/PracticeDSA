public class SortIndexing {
    public static void main(String args[]){
        int arr[]={1,8,7,2,3};
        int n=arr.length;
        int ans[]=new int[n];
        for(int i=0;i<n;i++){
            ans[i]=i;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    int t=ans[j];
                    ans[j]=ans[j+1];
                    ans[j+1]=t;
                }
            }
          
        }
        for(int i=0;i<n;i++){
            System.out.println(ans[i]);
        }
    }
    
}
