#include<stdio.h>

void add(int *a,int *b){
    *a = *a+*b;
}
void print(int n){
    while(n>0){
        printf("HelloWorld\n");
        n--;
    }
}
int main()
{
    int a = 3,b = 4;
    int *d = &a;
    int *e = &b;
    add(d,e);
    printf("%d\n",a);
    print(a);
    return 0;
}