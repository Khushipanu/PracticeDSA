public class Gcd {
    public static int gcd(int x,int y){ //24,15
        if(y==0){
            return x;
        }
        return gcd(y,x%y);

    }
    public static void main(String args[]){
        System.out.println(gcd(24,15));

    }
    
}
