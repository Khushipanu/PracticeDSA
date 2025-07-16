import java.util.*;
public class Leader{
    public static ArrayList<Integer> leaders(int[] nums) {
        int n=nums.length;
        ArrayList<Integer> li=new ArrayList<>();

        for(int i=0;i<n;i++){
            if(i==(n-1)){
                li.add(nums[i]);
                break;
                
            }
            int j=i;
            while( j<n && nums[i]>=nums[j] ){
               
                     j++;
                     if(j==n){
                        li.add(nums[i]);
                     }

                
               
            }
           
            
        }
        return li;
    }
    public static void main(String args[]){
        int arr[]={1,2,5,3,1,2};
        ArrayList<Integer> list=leaders(arr);
        System.out.println(list);
         

    }
}
