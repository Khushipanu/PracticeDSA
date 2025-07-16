import java.util.*;
public class ReturnIndicesByArrayL {
    public static ArrayList<Integer> findingIdx(int arr[],int idx,int target){
        if(idx==arr.length-1 ){
           return new ArrayList<Integer>(); //isse return hogi empty arraylist
        }
        
       ArrayList<Integer> ans=new ArrayList<>();
       if(arr[idx]==target){
        ans.add(idx);
       }

       ArrayList<Integer> smallAns= findingIdx(arr,idx+1,target);
       ans.addAll(smallAns);
       return ans;
        
    }
  
 public static void main(String args[]){
    int arr[]={1,2,3,2,2,5};
    ArrayList<Integer> ans=findingIdx(arr,0,2);
    for(Integer i:ans){
        System.out.println(i);
    }
    
}
    
}
