public class Printing {
    
    public static void printArray(int arr[],int idx){
        if(idx==arr.length-1){
            System.out.println(arr[idx]);
            return;
        }
       System.out.println(arr[idx]);
       printArray(arr,idx+1);
     

        }
     
    public static void main(String args[]){
        int arr[]={5,4,2,3};
        printArray(arr,0);
      
    }
    
    
}
