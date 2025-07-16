public class Factorial {
    public static int findingFact(int n){
        if(n==1){
            return 1;
        }
        return n* findingFact(n-1);

    }
    public static void main(String args[]){
        int ans=findingFact(5);
        System.out.println(ans);
    }
    
}
