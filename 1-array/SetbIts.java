import java.util.*;
public class SetbIts {
    public static void main(String[] args) {
        int n=7,k=2;
        int count=0;
        for(int i=0;i<n;i++){
            if(Integer.bitCount(i)==k){
                count++;
            }
        }
        System.out.println(count);
       
    }

    
}
