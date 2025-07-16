public class PowerOFn {
    public static int findingPower(int p,int q){
      if(q==0){
        return 1;
      }
    return findingPower(p,q-1) * p;
    
    }
    public static void main(String args[]){
        int ans=findingPower(2,3);
        System.out.println(ans);
    }
    
}
