public class SumRecursion {
    public static int sum(int arr[],int idx){

        if(idx==arr.length-1){
          return arr[idx];
        }
        return arr[idx]+sum(arr,idx+1);
         
      }
      public static void main(String args[]){
        int arr[]={1,5,2,8,5};
         int ans=sum(arr,0);
         System.out.println(ans);
          
      }
    
}
