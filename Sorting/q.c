
//quick sort
#include<stdio.h>
void quicksort(int arr[],int si,int ei);
int partition(int arr[],int si,int ei);
void printArray(int arr[],int n);
int main(){
    int n=5;
    int arr[]={4,3,2,7,8};
    quicksort(arr,0,n-1);
    printArray(arr,n);
    return 0;

}
void quicksort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int pdx=partition(arr,si,ei);
    quicksort(arr,si,pdx-1);
    quicksort(arr,pdx+1,ei);

}
void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}
int partition(int arr[],int si,int ei){
    int i=si-1;
    int pivot=arr[ei];
    for(int j=si;j<ei;j++){
        if(pivot>arr[j]){
            i++;
            int temp=arr[j];
            arr[j]=arr[i];
            arr[i]=temp;
        }
    }
    i++;
    int temp=pivot;
    arr[ei]=arr[i];
    arr[i]=temp;
    return i;
}