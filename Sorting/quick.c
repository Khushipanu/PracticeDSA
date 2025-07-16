#include<stdio.h>
void quicksort(int arr[],int si,int ei);
int partition(int arr[],int si,int ei);
void printArray(int arr[],int n);
int main(){
    int n=6;
    int arr[]={6,3,9,8,2,5};
    quicksort(arr,0,n-1);
    printArray(arr,n-1);

}
void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
   
}

void quicksort(int arr[],int si,int ei){
    if(si>=ei){
        return;
    }
    int pdx=partition(arr,si,ei);
    quicksort(arr,si,pdx-1);
    quicksort(arr,pdx+1,ei);
}
int partition(int arr[],int si,int ei){
    int pivot=arr[ei];
    int i=si-1;
    for(int j=si;j<ei;j++){
        if(arr[j]<=pivot){
            i++;
            //swap
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