public class S {
    public static void sum(int arr[],int idx,int currSum){
        if(idx==arr.length){
            System.out.println(currSum);
            return;
        }
        sum(arr,idx+1,currSum);
        sum(arr,idx+1,currSum+arr[idx]);
    }
    public static void main(String args[]){
        int arr[]={2,3}
;       sum(arr,0,0);
        
    }
    
}
