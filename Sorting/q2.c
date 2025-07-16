//merge sort
#include<stdio.h>
void mergesort(int arr[],int si,int ei);
void mergesort(int arr[],int si,int ei);
int main(){
    int n=5;
    int arr[]={4,3,2,7,8};
    mergesort(arr,0,n-1);

}
void mergesort(int arr[],int si,int ei){
    if(si>=ei){
        return;
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
}