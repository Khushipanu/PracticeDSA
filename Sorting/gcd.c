#include<stdio.h>
int gcd(int a,int b);  //15 9
int main(){
    int a=4;
    int b=2;
    printf("%d",gcd(a,b));

}
int gcd(int a,int b){
    if(b==0){
        return a;
    }
    return gcd(b,a%b);
}