public class FuncTough{
        public static int func(int n,int r){
        if(n<=0) return 1;
        if(n>3){
            r=n;
            return func(n-2,r) +2;
        }
        return func(n-1,r) +r;
    }
    public static void main(String args[]){
         int r=0;
        System.out.println(func(5,r));
    }
}