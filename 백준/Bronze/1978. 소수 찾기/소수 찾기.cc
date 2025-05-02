#include <iostream>
using namespace std;

bool is_prime(int n){
    if(n < 2) return false;
    for(int i = 2; i * i <= n; i++){
        if(n % i == 0)return false;
    }
    return true;
}

int main(){
    int N, num;
    cin >> N;
    int sum = 0;

    for(int i = 0; i < N; i++){
        cin >> num;
        if(is_prime(num)) sum ++;
    }
    cout << sum << endl;
    return 0;
}