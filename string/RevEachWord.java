import java.util.*;
public class RevEachWord {
    public static void reverse(String str){
        String ans=new String();
        StringBuilder sb=new StringBuilder("");
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch!=' '){
                sb.append(ch);

            }
            else{ //space hai
                sb.reverse();
                ans+=sb;  
                ans+=" "; 
                // sb=new StringBuilder("");  
                sb.delete(0,sb.length());   
            }
        }
        sb.reverse();
        ans+=sb;
        System.out.println(ans);

    }
    public static void main(String args[]){
        String str="i am an educator";
        reverse(str);

    }
    
    
}
