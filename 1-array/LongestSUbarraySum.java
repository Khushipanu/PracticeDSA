public class LongestSUbarraySum{
    public static void main(String args[]){
        int arr[]={1,2,3,1,1,1,1,4};
        int k=4;
        int max=0;
        int len=0;
        int sum;
        for(int i=0;i<arr.length;i++){
            sum=0;
            for(int j=i;j<arr.length;j++){
                sum+=arr[j];
                if(sum==k){
                     len=j-i+1;
                }
                max=Math.max(len,max);
                
               
                }
            }
            System.out.println(max);
        }
    }
