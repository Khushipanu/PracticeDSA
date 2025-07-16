public class Gcdd {
    public static int findingGcd(int x,int y){
        if(y==0){
            return x;
        }
        return findingGcd(y,x%y);

    }
        public static void main(String args[]){
        System.out.print(findingGcd(15,9));
        
    }
    
}
