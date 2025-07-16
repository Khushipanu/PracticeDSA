public class SumAlternate {

    public static int findingSum(int n){
      if(n==0){
        return 0;
      }
       if(n%2==0){
        return findingSum(n-1) -n;
       }
       else{
        return findingSum(n-1) +n;
       }
        

    }
    public static void main(String args[]){
        int ans=findingSum(5);
        System.out.println(ans);
    }
    
}
