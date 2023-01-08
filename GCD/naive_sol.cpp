#include <iostream>
using namespace std;

int GCD(int a,int b){
	int gcd = 0;
	int smaller = (a<b)?a:b;
    for(int i=smaller; i>= 2; i--)
   	{
    	if(a%i==0 && b%i==0)
        return i;
   	}
   	return 1;
}

int main(){
	int a,b;
	cin>>a>>b;
	cout<<GCD(a,b)<<endl;
	return 0 ;
}