public class BubbleSort{

    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void bubblesort(int arr[]){
        int idx[]=new int[arr.length];
        for(int i= 0;i<arr.length;i++){
            idx[i]=i;
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length -i-1 ;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    int tempIdx = idx[j];
                    idx[j] = idx[j + 1];
                    idx[j + 1] = tempIdx;
                }
            }
        }  
        for(int i=0;i<arr.length;i++){
            System.out.print(idx[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={5,7,3,4,8};
        bubblesort(arr);
     
        
    }
}