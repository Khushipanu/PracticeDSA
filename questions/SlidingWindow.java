public class SlidingWindow {
    public static void window(int arr[],int k){
        int l=0;   
        int r=k-1;  //  0 1 2 
        int n=arr.length;
        int sum=0;
        int max=Integer.MIN_VALUE;
      for(int i=l;i<k;i++){
        sum+=arr[i];    //sum=10
        
      }
        while(r<n-1){
            sum=sum-arr[l];
            l++;
            r++;
            sum=sum+arr[r];
            max=Math.max(sum,max);
    
          } 
        System.out.println(max);
    }
    public static void main(String[] args) {
        int arr[]={2,3,5,1,6,4};
        window(arr,3);
    }
}
