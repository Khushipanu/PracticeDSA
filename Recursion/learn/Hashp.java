
import java.util.*;
public class Hashp {
    public static void main(String args[]){
        HashMap<String ,Integer> mp=new HashMap<>();
        mp.put("khushi",1);
        mp.put("deepak",2);
        mp.put("aditya",3);
        // for(String key:mp.keySet()){
        //     System.out.printf(" name is %s and id is %d",key,mp.get(key) );
        //     System.out.println();
        //     System.out.println("name is "+key + "id is"+ mp.get(key));

        // }
        mp.forEach((key,val)->{
            System.out.println("key is" + key + "value is" +mp.get(key));
        });
    }
    
}
