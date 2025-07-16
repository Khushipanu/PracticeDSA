public class Count {
    public static int findingCount(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        int sAns=findingCount(n/10);
      
        return sAns + 1;
        

    }
    public static void main(String args[]){
        int ans=findingCount(153);
        System.out.println(ans);
    }
    
}
