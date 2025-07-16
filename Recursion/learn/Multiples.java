public class Multiples {
    public static void mul(int n,int key){
        if(key==0){
            return;
        }
      mul(n,key-1);
      System.out.println(n*key);

    }
    public static void main(String args[]){
        int key=5;
        mul(12,key);
     

    }
    
}
