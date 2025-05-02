#include <iostream>
using namespace std;

int main(){
    int N;
    cin >> N;
    for(int i = 1; i < N; i++){
        int sum = i;
        int n = i;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        if(sum == N){
            cout << i << endl;
            return 0;
        }
    }
    cout << 0 << endl;
    return 0;
}