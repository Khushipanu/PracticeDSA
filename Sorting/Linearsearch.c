#include<stdio.h>
#include<stdbool.h>
void search(int arr[],int k);
void printArray(int arr[]);
int main(){
    int arr[]={1,5,2,3,4};
    search(arr,5);
    printArray(arr);

}
bool flag=false;
void search(int arr[],int k){
    int n=5;
    
    for(int i=0;i<n;i++){
        
        if(arr[i]==k){
            flag=true;
            printf("found");
            break;

        }


    }
    if(!flag){
        printf("not found");
    }


}
void printArray(int arr[]){
    int n=5;
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}