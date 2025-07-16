import java.util.Arrays;

public class A {
      public static boolean anagram(String str1,String str2){
        
        if(str1.length()!=str2.length()){
            return false;
        }
        char [] s1=str1.toCharArray();
        char [] s2=str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);

      
       
    }
    public static void main(String args[]){
        String str1="aab";
        String str2="aba";
        if(anagram(str1,str2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }
        
    }
    
}
