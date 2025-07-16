import java.util.*;
public class ReverseK {
    public static void main(String args[]){
        Queue<Integer> q=new LinkedList<>();
        int k=3;
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        Stack<Integer> st=new Stack<>();
       for(int i=0;i<k;i++){
        st.push(q.remove());
     }
        //4 5
        while(!st.isEmpty()){
            q.add(st.pop());
        }
        //4 5 3 2 1
        for(int i=0;i<q.size()-k;i++){
            q.add(q.remove());
        }
        System.out.println(q);



        
    }
    
}
