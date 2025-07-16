public class Maxim {
    public static int maximum(int arr[],int idx){
        if(idx==arr.length-1){
            return arr[idx];
        }
        return Math.max(arr[idx], maximum(arr,idx+1));

    }
    public static void main(String args[]){
        int arr[]={1,2,4,6,0,8};
        System.out.println(maximum(arr,0));
    }
    
}
