
public class MinExpenditure {
    public static int findMinimumExpenditure(int arr[],int k){
        int n=arr.length;
        // int []ans=new int[n-(k-1)];
       int minAmt=Integer.MAX_VALUE;
        for(int i=0;i<n-(k-1);i++){
            int sum=0;
            for(int j=i;j<k;j++){
                sum+=arr[j]; 
                System.out.println(sum);
            }
           
           minAmt=Math.min(minAmt,sum); //110
        }
        return minAmt;


    }
    public static void main(String args[]){
        int arr[]={10,20,30,50,40};
        System.out.print(findMinimumExpenditure(arr,4));
    }
    
}
