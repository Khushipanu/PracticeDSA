public record NextPermutation() {
    public static void swap(int arr[],int i,int j){
      
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
      
    }

    public static void nextPermutation(int arr[]){
        int n=arr.length;
        int pivot=-1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]<arr[i+1]){
                pivot=i;
                break; 
            }
        }
        if(pivot==-1){
            int i=0;
            int j=arr.length-1;
            while(i<=j){
            swap(arr,i,j);
            i++;
            j--;
            }
            
           return;
            

        }
        for(int i=n-1;i>=pivot;i--){
            if(arr[i]>arr[pivot]){
                swap(arr,i,pivot);
                break;
            }
        }
        //reverse 
        int i=pivot+1;
        int j=n-1;
        while(i<=j){
            swap(arr,i,j);
            i++;
            j--;


        }

    }
   
        
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }
    public static void main(String args[]){
        int arr[]={1,2,3,6,5,4};
        nextPermutation(arr);
        printArray(arr);

     

    }
    
}
