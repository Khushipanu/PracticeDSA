public class FirstNegative {
    public static int[] printnegative(int arr[],int k){
        int n=arr.length;
        int ans[]=new int[n-k+1];
        int temp=0;
        for(int i=0;i<=(n-k);i++){
            boolean found=false;
            for(int j=i;j<i+k;j++){
                if(arr[j]<0){
                    ans[temp++]=arr[j];
                    found=true;
                    break;
                }
            }
            if(!found){
                arr[temp++]=0;
            }
        }
        return ans;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]={-8,2,3,-6,10};
        int ans[]=printnegative(arr,2);
        printArray(ans);

    }
    
}
