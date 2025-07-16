#include<stdio.h>
void print(int arr[],int n);

int main(){
    printf("enter n");
    int n;
   
    scanf("%d",&n);
    int arr[n];
    printf("enter elements");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);
    }
    
    for(int i=0;i<n;i++){ 
        int min=i;    
        for(int j=i+1;j<n;j++){
            if(arr[j]<arr[min]){
                min=j;
            }
        }
        int temp=arr[min];
        arr[min]=arr[i];
        arr[i]=temp;
    }
    print(arr,n);
}
void print(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}