public class PName{
    public static void name(int n){
        if(n==1){
            System.out.println("khushi");
            return;
        }
        System.out.println("khushi");
        name(n-1);


    }
    public static void main(String args[]){
        name(5);

    }
}