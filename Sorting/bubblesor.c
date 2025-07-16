#include<stdio.h>
int main(){
    int n=5;
    int arr[]={4,5,2,7,1};
    //selection sort
    // for(int i=0;i<n;i++){
    //     int min=i;
    //     for(int j=i+1;j<n;j++){

    //         if(arr[j]<arr[min]){
    //             min=j;
    //         }
    //     }
    //     int temp=arr[min];
    //     arr[min]=arr[i];
    //     arr[i]=temp;

    // }

    //insertion sort
    for(int i=1;i<n;i++){
        int curr=arr[i];
        int prev=i-1;
        while(prev>=0 && curr<arr[prev]){
            arr[prev+1]=arr[prev];
            prev--;
        }
        arr[prev+1]=curr;
    }




    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}