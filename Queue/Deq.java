import java.util.*;
public class Deq {
    public static void main(String args[]){
        Deque<Integer> dq=new ArrayDeque<>();
        Deque<Integer> dq2=new LinkedList<>();
        dq.add(3);
        dq.addFirst(5);
        System.out.println(dq);
        dq.removeLast();
        System.out.println(dq);
    }
    
}
