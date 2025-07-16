import java.util.*;

public class K {
    public static void func(String arr[]){
        int n=arr.length;
        Arrays.sort(arr);   //nlogn
        String s1=arr[0];
        String s2=arr[n-1];
        String ans="";
        int x=0;
        int y=0;
        while(x<s1.length() && y<s2.length() ){
            if(s1.charAt(x) == s2.charAt(y)){
                ans+=s1.charAt(x);
                x++;
                y++;

            }else{
                break;   
            }
        }
        System.out.println(x);
        System.out.println(ans);
       

    }
    public static void main(String args[]){
        String []arr={"flower","flow","flight"};
        func(arr);

          
           
       
        

    }
    
}
