#include<stdio.h>
void hanoi(int n,char source,char aux,char dest);
int main(){
    int n=3;
    hanoi(n,'A','B','C');

}
void hanoi(int n,char source,char aux,char dest){
    if(n==1){
        printf("move from %c to %c",source,dest);
        return;
    }
    hanoi(n-1,source,dest,aux);
    printf("move from %c to %c",source,dest);
    hanoi(n-1,aux,source,dest);
}