 
 import java.util.*;
 public class LongestConsecutive{

 public static boolean ls(int arr[], int target) {
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == target) {
        return true;
      }
    }
    return false;
  }

  public static int longestConsecutive(int[] nums) {
    int maxcount = 0;

    int n = nums.length;
    for (int i = 0; i < n; i++) {
      int x = nums[i]; // 100
      int count = 1;
      while (ls(nums, x + 1) == true) {
        x = x + 1;
        count++;
        maxcount = Math.max(count, maxcount);
      }
    }
    return maxcount;
  }
  public static void main(String[] args) {
    int arr[]={1,3,4,2,6,48,9,10,11,3,2,12,13};
    int ans=longestConsecutive(arr);
    System.out.println(ans);
    
  }
}