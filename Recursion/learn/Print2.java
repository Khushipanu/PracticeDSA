import java.util.*; 
public class Print2{
    public static void printing(int n){
        if(n==1){
            System.out.println(n);  //1
            return;
        }
       
        printing(n-1);  //5
        System.out.println(n);
    }
    public static void main(String args[]){  //1 to 10
        printing(5);
       
    }

}
