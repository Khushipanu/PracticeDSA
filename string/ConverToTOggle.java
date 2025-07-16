import java.util.*;
public class ConverToTOggle {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Physics");
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            int ascii=(int) ch;
            if(ascii>=65  && ascii <=90){
                ascii+=32;
                char rechar=(char) ascii;
                sb.setCharAt(i,rechar);
            }
            else{
                ascii-=32;
                char rechar=(char) ascii;
                sb.setCharAt(i,rechar);
            }

                }
                System.out.println(sb);

      

        

    }
    
}
