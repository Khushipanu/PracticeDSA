#include<stdio.h>
#include<stdbool.h>
void bsearch(int arr[],int target);
int main(){
    int n=4;
    int arr[]={3,4,7,8};
    bsearch(arr,4);
}
void bsearch(int arr[],int target){
    int n=5;
    int si=0;
    int ei=n-1;
    while(si<=ei){
        int mid=(si+ei)/2;
        if(arr[mid]==target){
            printf(" %d is found at index %d",arr[mid],mid);
            break;
        }
        else if(arr[mid]< target){
            si=mid+1;
        }
        else{
            ei=mid-1;
        }
    }

    
}