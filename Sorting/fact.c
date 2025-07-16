#include<stdio.h>
int fact(int n);
int main(){
    int n=5;
    printf("factorial is: %d",fact(n));
}
int fact(int n){
    if(n==1 || n==0){
        return 1;
    }
    return n* fact(n-1);

}