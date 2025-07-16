public class OnetoN{
    public static void printOnetoN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        printOnetoN(n-1);

        
    }
    public static void main(String args[]){
        printOnetoN(5);
    }
}