public class Sum {
    public static int findingSum(int n){
      if(n==1){
        return 1;
      }
        int ans=findingSum(n-1)+n;
        return ans;

    }
    public static void main(String args[]){
        int ans=findingSum(5);
        System.out.println(ans);
    }
    
}
