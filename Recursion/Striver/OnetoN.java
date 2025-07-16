public class OnetoN {
     public static void onetoN(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n);
        onetoN(n-1);
        
        


    }
    public static void main(String args[]){
       onetoN(5);

    }

    
}
