#include<stdio.h>
void printing(int arr[],int n);
int main(){
    //bubble sort
    int n;
    printf("enter n");
    scanf("%d",&n);
    int arr[n];

    printf("enter the elements");
    for(int i=0;i<n;i++){
        scanf("%d",&arr[i]);

    }


    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            if(arr[j]>arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
    printing(arr,n);


}
void printing(int arr[],int n){
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);


    }

}