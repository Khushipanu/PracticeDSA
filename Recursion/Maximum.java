public class Maximum {
    public static int findingMax(int arr[],int idx){

        if(idx==arr.length-1){
          return arr[idx];
        }
        return Math.max(arr[idx],findingMax(arr,idx+1));
         
      }
      public static void main(String args[]){
        int arr[]={1,5,2,8,5};
         int ans=findingMax(arr,0);
         System.out.println(ans);
          
      }
      
    
}
