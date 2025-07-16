public class Kmultiple {
    public static void findingMultiples(int n,int k){
       
       if(k==1){
       System.out.println(n);
       return;
       } 
    findingMultiples(n,k-1);
    System.out.println(n*k);
   
    }
    public static void main(String args[]){
    findingMultiples(12,5);
    
   
       
    }
    
}
