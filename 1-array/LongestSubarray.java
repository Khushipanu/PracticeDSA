public class LongestSubarray {
    public static int longestarr(int arr[],int k){
        int max=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                    max=Math.max(max,j-i+1);
                    break;
                }
            }
        }
        return max;
    }
    public static void main(String args[]){
        int arr[]={1,2,1,1,1,4,3};
        System.out.println(longestarr(arr,3));
    }
    
}
