import java.util.*;
public class Anagr {
    public static HashMap<Character,Integer> isanagramFrequency(String str){
        HashMap<Character,Integer> mp=new HashMap<>();
        int count=1;

        
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(!mp.containsKey(ch)){
                mp.put(ch,count);
            }else{
                mp.put(ch,mp.get(ch)+1);
            }
        }
        return mp;


    }
    public static boolean isanagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;
        HashMap<Character,Integer> first=isanagramFrequency(s1);
        HashMap<Character,Integer> second=isanagramFrequency(s2);
        if(first.equals(second)) {
            return true;
        }
        

return false;

    }
    public static void main(String args[]){
        String s1="khushi";
        String s2="hushik";
       System.out.println(isanagram(s1, s2));
        
        
    }
    
}
