public class ReturnIndices {
    public static void findingIdx(int arr[],int idx,int target){
        if(idx>=arr.length){
           return;
        }
        if(arr[idx]==target){
            System.out.println(idx);
        }
     
      findingIdx(arr,idx+1,target);
        
    }
  
 public static void main(String args[]){
    int arr[]={1,2,3,2,2,2};
    findingIdx(arr,0,2);
    
}
}
