import java.util.*;
public class RemoveDuplicateh {
    public static int[] removeduplicate(int arr[]){
        int n=arr.length;
        Set<Integer> st=new LinkedHashSet<>();  //unique elements store
        for(int nums:arr){
           st.add(nums);
        }
        int m=st.size();
        int ans[]=new int[m];
        int i=0;
       for(int num:st){
        ans[i++]=num;
       }
       return ans;

    
    }
    public static void display(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public static void main(String args[]){
        int arr[]={1,2,4,3,2};
        System.out.println();
        int res[]=removeduplicate(arr);
        display(res);

    }
    
}
