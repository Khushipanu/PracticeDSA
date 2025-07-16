class Solution {
    public static int secondLargestElement(int[] arr) {
        int max=0;
        int s_max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
                System.out.print(max);
           
            }
            
        }
        System.out.println();
        //max->8
        for(int i=0;i<arr.length;i++){
             if(arr[i]!=max && arr[i]>s_max ){
                s_max=arr[i];
                System.out.print(s_max);
                

            }
        }
      return s_max;

    
    }
    public static void main(String args[]){
        int arr[]={1,2,6,4,8,7};
        System.out.println(secondLargestElement(arr));
    }
}