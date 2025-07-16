import java.util.*;
public class Momentum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=4;
        int ans=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int m=(a*b);
            ans+=m;
        }
        System.out.println(ans);
    }
    
}
