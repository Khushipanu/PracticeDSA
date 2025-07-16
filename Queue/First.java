import java.util.*;
public class First {
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        q.add(3);
        q.add(4);
        q.add(5);
        while(q.size()>1){
            System.out.println(q.peek());
            int x=q.remove();


        }
        System.out.println(q);

    }
    
}
