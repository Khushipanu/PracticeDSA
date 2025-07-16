#include<stdio.h>
int gcd(int a,int b);
int main(){
    int a,b;
    printf("output is %d",gcd(15,9));
    return 0;

}
int gcd(int a,int b){
    if(b==0){
        return a;
    }
    return gcd(b,a%b);
}