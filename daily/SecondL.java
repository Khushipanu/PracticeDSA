public class SecondL{
    public static void main(String args[]){
        int arr[]={1,4,2,8,7,7,7,5};
        int max=Integer.MIN_VALUE;
        int s_max=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]>s_max && arr[i]!=max){
                s_max=arr[i];
            }
        }
       System.out.println(max);
       System.out.println(s_max);

    }
}