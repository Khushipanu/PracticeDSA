//merge sorting
#include<stdio.h>
void mergesort(int arr[],int si,int ei);
void merge(int arr[],int si,int ei);
void printArray(int arr[],int n);
int main(){
    int n=5;
    int arr[]={4,2,3,6,5};
    mergesort(arr,0,n-1);
    printArray(arr,n);
    return 0;

}
void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}
void mergesort(int arr[],int si,int ei){
    if(si>=ei){
        return ;
    }
    int mid=(si+ei)/2;
    mergesort(arr,si,mid);
    mergesort(arr,mid+1,ei);
    merge(arr,si,ei);
}
void merge(int arr[],int si,int ei){
    int mid=(si+ei)/2;
    int len1=mid-si+1;
    int len2=ei-mid;
    int arrfirst[len1];
    int arrsecond[len2];
    int s=si;
    for(int i=0;i<len1;i++){
        arrfirst[i]=arr[s++];
    }
    int t=mid+1;
    for(int i=0;i<len2;i++){
        arrsecond[i]=arr[t++];
    }
    int idx1=0,idx2=0,k=si;
   while(idx1<len1 && idx2<len2){
         if(arrfirst[idx1]> arrsecond[idx2]){
            arr[k++]=arrsecond[idx2++];
         }
         else{
            
            arr[k++]=arrfirst[idx1++];
         }
   }
   while(idx1<len1){
    arr[k++]=arrfirst[idx1++];
   }
   while(idx2<len2){
    arr[k++]=arrsecond[idx2++];
   }


}