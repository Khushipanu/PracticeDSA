public class MergeSort {
    public static void mergeSort(int arr[],int s,int e){
        int n=arr.length;
        if(s>=e){
            return;
        }
        int mid=s+(e-s)/2;
        mergeSort(arr,0,mid);
        mergeSort(arr,mid+1,e);  
        merge(arr,s,e);
    }
    public static void merge(int arr[],int s,int e){
        int n=arr.length;
        int mid=s+(e-s)/2;
        int len1=mid-s+1;
        int len2=e-mid;

        int arrFirst[]=new int[len1];
        int arrSecond[]=new int[len2];

        int start=s;
        for(int i=0;i<len1;i++){
            arrFirst[i]=arr[start++];
        }
        int midD=mid+1;
        for(int i=0;i<len2;i++){
            arrSecond[i]=arr[midD++];
        }
        int idx1=0;
        int idx2=0;
        int k=s;
        while(idx1<len1 && idx2<len2){
            if(arrFirst[idx1]<arrSecond[idx2]){
                arr[k++]=arrFirst[idx1++];
            }else{
                arr[k++]=arrSecond[idx2++];
            }
        }
        while(idx1<arrFirst.length){
            arr[k++]=arrFirst[idx1++];
        }
        while(idx2<arrSecond.length){
            arr[k++]=arrSecond[idx2++];
        }

    }
    public static void printing(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String ags[]){
        int arr[]={3,4,1,2,7};
        mergeSort(arr,0,arr.length-1);
        printing(arr);

    }
    
}
