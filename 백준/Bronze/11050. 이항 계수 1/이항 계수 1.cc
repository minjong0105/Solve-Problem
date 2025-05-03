#include <iostream>
using namespace std;

int factorial(int n){
    int result = 1;
    for(int i = 2; i <= n; i++){
        result *= i;
    }
    return result;
}

int main(){
    int N, K;
    cin >> N >> K;
    cout << factorial(N) / (factorial(K) * factorial(N - K)) << endl;
    return 0;
}