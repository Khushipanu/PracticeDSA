import java.util.*;
public class Once {
    public static void once(int arr[]){
         int count=1;
        HashMap<Integer,Integer> mp=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],count);
            }else{
                mp.put(arr[i],mp.get(arr[i])+1);

            }
        }
        System.out.println(mp);
        for(Integer x:mp.keySet()){
            if(mp.get(x)==1){
                  System.out.println(x);
            break;

            }
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,4,4,2,1,6,7};
        once(arr);


    }
    
}
