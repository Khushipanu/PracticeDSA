public class subarray {
    public static int subarraymax(int arr[]){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
           
            for(int j=i;j<n;j++){
                 int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                max=Math.max(max,sum);

            }
        }
        return max;

    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        System.out.println(subarraymax(arr));
    }
    
}
