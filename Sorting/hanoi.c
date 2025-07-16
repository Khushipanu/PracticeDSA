#include<stdio.h>
void hanoi(int n,char source,char aux,char destination);
int main(){
    int n=3;
    hanoi(n,'A','B','C');
   
}
void hanoi(int n,char source,char aux,char destination){
    if(n==1){
        printf("Move disc from%c to %c" ,source,destination);
        printf("\n");
        return;
    }
    hanoi(n-1,source,destination,aux);
    printf("move disc from %c to %c",source,destination);  printf("\n");
    hanoi(n-1,aux,source,destination);
}
