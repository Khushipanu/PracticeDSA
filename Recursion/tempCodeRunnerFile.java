import java.util.*;
public class OddSubset {
    public static void subset(int arr[],int idx,ArrayList<Integer> li){
        ArrayList<Integer> list=new ArrayList<>();
        if(idx==arr.length-1){
            System.out.println(li);
            return;

        }
        subset(arr,idx+1,li.add(arr[idx]));
        subset(arr,idx+1,li);



    }
    public static void main(String args[]){
        int arr[]={1,2,3};
        ArrayList<Integer> li=new ArrayList<>();
        subset(arr,0,null);

    }
    
}
