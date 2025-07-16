public class Sortingindices {
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Sortingindices(int arr[]){
        int indices[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            indices[i]=i;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    int temp2=indices[j];
                    indices[j]=indices[j+1];
                    indices[j+1]=temp2;

                }


            }
        }
        for(int i=0;i<indices.length;i++){
            System.out.println(indices[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={4,5,3,8,2};
        Sortingindices(arr);
       

    }
    
}
