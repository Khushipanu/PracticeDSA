#include<stdio.h>
//minimum and maximum
int min(int arr[],int n);
int max(int arr[],int n);
int main(){
    int n=5;
    int arr[]={1,5,3,8,4};
    printf("minimum value is:%d ",min(arr,n));
    printf("maximum value is:%d ",max(arr,n));



}
int min(int arr[],int n){
    int min=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<min){
            min=arr[i];
        }
    }
    return min;
}
int max(int arr[],int n){
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]>max){
            max=arr[i];
        }
    }
    return max;
}