public class Sumofdigits {
    public static int sumofdigits(int n){
        if(n>=0 && n<=9){  //single digit
            return n;

        }

    
    return sumofdigits(n/10) + (n%10) ;  //1
    }
    public static void main(String[] args) {
        System.out.println(sumofdigits(123));  //6
        
    }
    
}
