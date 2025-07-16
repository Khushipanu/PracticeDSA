public class SumOfDigits {
    public static int findingSum(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int sAns=findingSum(n/10);
        int lDigit=n%10;
        return sAns + lDigit;
        

    }
    public static void main(String args[]){
        int ans=findingSum(153);
        System.out.println(ans);
    }
    
    
}
