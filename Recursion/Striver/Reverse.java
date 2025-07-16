public class Reverse {
    public static void rev(int i,int arr[]){
        if(i==arr.length-1){
            System.out.println(arr[i]);
            return;
        }
        rev(i+1,arr);
        System.out.println(arr[i]);



    }
    public static void main(String args[]){
        int arr[]={1,2,3,4,5};
        rev(0,arr);
    }
    
}
