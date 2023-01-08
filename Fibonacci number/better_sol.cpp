#include <iostream>
#include <vector>
using namespace std;

long long fibo(int n){
	long long a[n];
	a[0] = 0;
	a[1] = 1;
	for(int i=2; i<=n; i++){
		a[i] = a[i-1]+a[i-2];
	}

	return a[n];
}

int main() {
	int n;
	cin >> n;
	cout << fibo(n) << endl;
	return 0;
}