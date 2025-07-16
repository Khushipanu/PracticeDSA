import java.util.HashMap;

public class C {
    public static void main(String args[]){
        String s="geekg";
           HashMap<Character,Integer> mp=new HashMap<>();
      int count=0;
      for(int i=0;i<s.length();i++){
          char ch=s.charAt(i);
          if(!mp.containsKey(ch)){
              mp.put(ch,count);
          }else{
              mp.put(ch,mp.get(ch)+1);
          }
           
      }
      System.out.println(mp);
       
    }
}