import java.util.*;
public class ActivitySelection{
    public static void main(String args[]){
        //end time basis sorted given
        int start[]={1,3,0,5,8,5};
        int end[]={2,4,6,7,9,9};

        int maxAct=0;
        ArrayList<Integer> ans=new ArrayList<>();
        //1st activity krni hi hai
        maxAct=1;
        ans.add(0);
        int lastend=end[0];
        for(int i=1;i<end.length;i++){
            if(start[i]>=lastend){
                maxAct++;
                ans.add(i);
                lastend=end[i];
            }

        }
        System.out.println("max activities "+maxAct);
        //activities jinko maine select kiya
        for(int i=0;i<ans.size();i++){
            System.out.println(ans.get(i)+" ");
        }



    }

}