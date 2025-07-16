#include<stdio.h>
int max(int a,int b);
int min(int a,int b);
int fmmin(int arr[],int idx,int n);
int fmmax(int arr[],int idx,int n);
int main(){
    int n=5;
    int arr[]={3,5,1,6,2};
    int m=fmmax(arr,0,n);
    printf("maximum is :%d",m);
    printf("Mininmum is: %d",fmmin(arr,0,n));

}
int max(int a,int b){
    return a>b? a:b;
}
int min(int a,int b){
    return a<b? a:b;
}
int fmmax(int arr[],int idx,int n){
    if(idx==n-1){
        return arr[idx];

    }
    return max(arr[idx],fmmax(arr,idx+1,n));

}
int fmmin(int arr[],int idx,int n ){
    if(idx==n-1){
        return arr[idx];
    }
    return min(arr[idx],fmmin(arr,idx+1,n));
}