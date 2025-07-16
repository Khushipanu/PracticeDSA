#include<stdio.h>
void selectionsort(int arr[],int n);
void printArray(int arr[],int n);
int main(){
    int n=5;
    int arr[]={3,4,1,2,7};
    selectionsort(arr,n);
    printArray(arr,n);

}
void selectionsort(int arr[],int n){
    for(int i=0;i<n;i++){
        int min=i;
        for(int j=i+1;j<n;j++){
            if(arr[min]>arr[j]){
                min=j;

            }      
        }
        int temp=arr[i];
        arr[i]=arr[min];
        arr[min]=temp;

    }

}
void printArray(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}