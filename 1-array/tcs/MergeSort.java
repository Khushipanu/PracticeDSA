public class MergeSort{
    public static void merge(int arr[],int s,int e){
        int mid=(s+e)/2;
       int len1=mid-s+1;
       int len2=e-mid;
       int arrFirst[]=new int[len1];
       int arrSec[]=new int[len2];
       int p=s; 
       for(int i=0;i<len1;i++){
        arrFirst[i]=arr[p++];
       }
       int q=mid+1;
       for(int i=0;i<len2;i++){
        arrSec[i]=arr[q++];
       }
       int idx1=0;
       int idx2=0;
       int k=s;
       while(idx1<len1 && idx2<len2){
        if(arrFirst[idx1]<arrSec[idx2]){
            arr[k++]=arrFirst[idx1++];

        }else{
            arr[k++]=arrSec[idx2++];
        }
       }
       while(idx1<len1){
        arr[k++]=arrFirst[idx1++];
       }
        while(idx2<len2){
        arr[k++]=arrSec[idx2++];
       }

    }
    public static void mergesort(int arr[],int s,int e){
        if(s>=e){
            return;
        }
        int mid=(s+e)/2;
        mergesort(arr,s,mid);
        mergesort(arr,mid+1,e);
        merge(arr,s,e);
       


    }
    public static void main(String args[]){
        int arr[]={1,4,2,6,9,4};
        mergesort(arr,0,arr.length-1);
         for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
       
    }
}