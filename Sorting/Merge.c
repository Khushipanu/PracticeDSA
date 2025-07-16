#include<stdio.h>
void mergesort(int arr[],int s,int e);
void merge(int arr[],int s,int e);

void printArray(int arr[]);


int main(){
    int arr[]={3,4,1,2,7};
    int n=5;
    mergesort(arr,0,n-1);
    printArray(arr);

}
void mergesort(int arr[],int s,int e){
    if(s>=e){
        return;
    }
    int mid=(s+e)/2;
    mergesort(arr,s,mid);
    mergesort(arr,mid+1,e);
    merge(arr,s,e);
}

void merge(int arr[],int s,int e){
    int mid=(s+e)/2;
    int len1=mid-s+1;  // 2 4 5
    int len2=e-mid;     //1 8

    int arrfirst[len1];   // 2 4 5 
    int arrsecond[len2];   // 1 8
    int l=s;
    for(int i=0;i<len1;i++){
        arrfirst[i]=arr[l];
        l++;
    }
    int p=mid+1;
    for(int j=0;j<len2;j++){
        arrsecond[j]=arr[p++];
    }

    //elements aagyehai arrays mai new wale

    //ab checking swaping wgr 

    int idx1=0;
    int idx2=0;
    int k=s;
  
    while(idx1<len1 && idx2<len2){
        if(arrfirst[idx1]>arrsecond[idx2]){
            arr[k++]=arrsecond[idx2++];
        }
        else{
            arr[k++]=arrfirst[idx1++];

        }
    }
    while(idx1<len1){
        arr[k++]=arrfirst[idx1++];
    }
    while(idx2<len2){
        arr[k++]=arrsecond[idx2++];
    }

}
void printArray(int arr[]){
    int n=5;
    for(int i=0;i<n;i++){
        printf("%d",arr[i]);
    }
}