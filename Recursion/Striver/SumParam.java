public class SumParam {
    public static void sum(int i,int sum){
        if(i<=0){
            System.out.println(sum);
            return;
        }
        sum(i-1,sum+i);
    }
    public static void main(String[] args) {
        sum(5,0);
    }

    
}
