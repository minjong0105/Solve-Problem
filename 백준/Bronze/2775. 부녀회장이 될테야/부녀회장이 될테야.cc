#include <iostream>
using namespace std;

int count(int k, int n){
    if(k == 0) return n;
    if(n == 1) return 1;
    return count(k-1, n) + count(k, n-1);
}

int main(){
    int T, k, n;
    cin >> T;
    for(int i = 0; i < T; i++){
        cin >> k >> n;
        cout << count(k, n) << "\n";
    }
    return 0;
}