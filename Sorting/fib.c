#include<stdio.h>
int fib(int n);
int main(){
    int n=4;
    printf("factorial is: %d",fib(n));
}
int fib(int n){
    if(n==1 || n==0){
        return n;
    }
    return fib(n-1)+ fib(n-2);

}