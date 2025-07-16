import java.util.*;
public class Another{
    public static void main(String args[]){
        int start[]={10,12,20};
        int end[]={20,25,30};
        ArrayList<Integer> ans=new ArrayList<>();
        int task=1;//as we are assuming first task is always chosen
        int taskend=end[0];
        for(int i=1;i<start.length;i++){
            if(start[i]>=taskend){
                task++;
                taskend=end[i];
                
            }
        }
        System.out.println("ans is " +task);
    
    }

}