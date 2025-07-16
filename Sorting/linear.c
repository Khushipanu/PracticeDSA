//linear search
#include<stdio.h>
#include<stdbool.h>
void linear(int arr[],int target,int n);
int main(){
    int n=5;
    int arr[]={2,3,4,1,8};
    linear(arr,4,n);
    return 0;

}
void linear(int arr[],int target,int n){
    bool found=false;
    for(int i=0;i<n;i++){
        if(arr[i]==target){
            printf("found %d at index : %d ",arr[i],i);
            found=true;
        }

    }
    if(!found){
        printf("no found !! sorry");
    }
   
}