//same question but return in arraylist
import java.util.*;
public class FindInd {
    public static ArrayList<Integer> findingIdx(int arr[],int x,int idx){
        ArrayList<Integer> a=new ArrayList<>();
        if(idx==arr.length){
            return a;
        }
        if(arr[idx]==x){
            a.add(idx);
        }
        ArrayList<Integer> Sans=new ArrayList<>();
        Sans=findingIdx(arr,x,idx+1);
        a.addAll(Sans);

        return a;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,2,2,5};
       System.out.println(findingIdx(arr,2,0));

    }

    
}
