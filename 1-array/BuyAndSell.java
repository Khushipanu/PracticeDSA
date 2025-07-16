public class BuyAndSell {
    public static int buyAndsell(int arr[]){
        int n=arr.length;
        int bp=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<n;i++){
            if(bp<arr[i]){
                int profit=arr[i]-bp;
                maxProfit=Math.max(profit,maxProfit);     
            }
            else{
                bp=arr[i];
            }

        }
        return maxProfit;
        
        
    }
    public static void main(String args[]){
        int arr[]={7,1,5,3,6,4};
        System.out.print(buyAndsell(arr));
    }
    
}
