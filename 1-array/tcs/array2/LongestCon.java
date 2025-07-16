import java.util.*;
public class LongestCon {
    public static int longestConsecutive(int arr[]){
        int n=arr.length;
        if(n==0) return 0;
        int max=1;
        HashSet<Integer> set=new HashSet<>();
        for(Integer s:arr){
            set.add(s);
        }
        for(Integer i:set){
            if(!set.contains(i-1)){
                int count=1;
                int x=i;
                while(set.contains(x+1)){
                    count++;
                    x++;

                }
                max=Math.max(max,count)
;
            }
        }
        return max;

    }
      public static void main(String[] args) {
    int arr[]={1,3,4,2,6,48,9,10,11,3,2,12,13};
    int ans=longestConsecutive(arr);
    System.out.println(ans);
    
  }

    
}
