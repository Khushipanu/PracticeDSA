public class SumofSubarray {
    public static void counting(int arr[],int k){
        int n=arr.length;
        int len=0;
        int maxl=0;
        for(int i=0;i<n;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum==k){
                    for(int x=i;x<=j;x++){
                        System.out.println(arr[x] +" ");

                    }
                    System.out.println();
                    len=j-i+1;  
                    maxl=Math.max(maxl,len);     
                }

            }
        }
        System.out.println(maxl);
       
    }
    public static void main(String args[]){
        int arr[]={2,1,3,1,4};
        counting(arr,5);

    }
    
}
