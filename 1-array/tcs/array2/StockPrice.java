public class StockPrice {
    public static int stocks(int arr[]){
        int maxP=0;
        int buyP=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            int sp=arr[i];
            int profit=sp-buyP;
            buyP=Math.min(buyP,arr[i]);
            maxP=Math.max(maxP,profit);
        }
        return maxP;
    }
    public static void main(String args[]){
        int []stocks={7,1,5,3,6,4};
        System.out.println(stocks(stocks));

    }
    
}
