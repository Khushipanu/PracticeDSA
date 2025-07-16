public class TargetSubarray{
    public static void printarr(int arr[],int target){
       
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==target){
                    int res[]=new int[j-i+1];
                      for(int k=i;k<=j;k++){
                        res[k-i]=arr[k];
                      }
                      for(int val:res){
                        System.out.print(val+" ");
                      }
                      System.out.println();

                }

            }
        }
    }
    public static void main(String args[]){
        int arr[]={3,4,-7,1,3,3,1,-4};
        printarr(arr,7);
       
        

    }
}