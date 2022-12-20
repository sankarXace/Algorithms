#include<stdio.h>
int Power(int a,int b)
{
    int r = 1;
    while(b>0){
        r*=a;
        b--;
    }
    return r;
}
int main()
{
    int base,power;
    scanf("%d %d",&base,&power);
    int result = Power(base,power);
    printf("%d",result);
}