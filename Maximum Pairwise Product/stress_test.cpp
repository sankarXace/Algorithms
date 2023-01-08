#include <iostream>
#include <vector>
#include <algorithm>
#include <cstdlib>

using std::cin;
using std::cout;
using std::vector;

long long MaxPairwiseProduct(const std::vector<int>& numbers) {
    long long max_product = 0;
    int n = numbers.size();

    for (int first=0; first<n; ++first) {
        for (int second=first+1; second<n; ++second){
            if(((long long)numbers[first]*numbers[second]) > max_product){
                max_product = ((long long)numbers[first])*numbers[second];
            }
        }
    }
    return max_product;
}

long long MaxPairwiseProductFast(const std::vector<int>& numbers){
    int n = numbers.size();

    int max_index1 = -1;
    for (int i=0; i<n; i++){
        if((max_index1 == -1) || (numbers[i]>numbers[max_index1])){
            max_index1 = i;
        }
    }

    int max_index2 = -1;
    for(int i=0; i<n; i++){
        if((i != max_index1) && ((max_index2 == -1) || (numbers[i]>numbers[max_index2]))){
            max_index2 = i;
        }
    }

    return ((long long)numbers[max_index1])*numbers[max_index2] ;
}

int main() {
    while (true) {
        int n = rand() % 100 + 2 ;
        cout << n << "\n" ;
        vector<int> a;
        for (int i=0; i<n; ++i){
            a.push_back(rand() % 100000);
        }
        for (int i=0; i<n; ++i){
            cout<< a[i] << " ";
        }
        cout<<"\n";
        long long res1 = MaxPairwiseProduct(a);
        long long res2 = MaxPairwiseProductFast(a);

        if(res1 != res2){
            cout << "Wrong " << res2 << " " << res1 ; 
        }
        else{
            cout << "Ok" ;
        }
    }
    int n;
    cin >> n;
    vector<int> numbers(n);
    for (int i = 0; i < n; ++i) {
        cin >> numbers[i];
    }

    cout << MaxPairwiseProductFast(numbers) << "\n";
    return 0;
}
