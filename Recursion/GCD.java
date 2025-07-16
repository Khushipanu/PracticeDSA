public class GCD {
    public static int findingGcd(int x,int y){
           if(y==0){
            return x;
           }
           return findingGcd(y,x%y);
        }
     

    
    public static void main(String args[]){
        int ans=findingGcd(15,9);
        System.out.println(ans);
    }
    

}